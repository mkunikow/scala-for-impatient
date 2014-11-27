package exercises.chapter11

/**
 * Created by mkunikowski on 11/26/2014.
 */
object MainE8 extends App {

  type Row = Vector[Double]
  type Matrix = Vector[Row]

  class RichMatrix private (private val matrix: Matrix) {

    private def dotProd(v1: Row,v2: Row) =
      v1 zip v2 map{ t => t._1 * t._2 } reduceLeft(_ + _)

    private def sumRows(v1: Row, v2: Row) =
      v1 zip v2 map {t => t._1  +  t._2 }

    private def transpose(m: Matrix): Matrix =
      if(m.head.isEmpty) Vector() else m.map(_.head) +: transpose(m.map(_.tail))

    private def mXm( m1:Matrix, m2:Matrix) =
      for( m1row <- m1 ) yield
        for( m2col <- transpose(m2) ) yield
          dotProd( m1row, m2col )

    private def sum(m1: Matrix, m2: Matrix): Matrix = {
      require(m1.length == m2.length)
      require(m1.head.length == m2.head.length)

      m1 zip m2 map (t => sumRows(t._1, t._2))
    }

    def apply(i:Int, j:Int) = matrix(i)(j)

    def *(that:RichMatrix) = RichMatrix(mXm(this.matrix, that.matrix))

    def *(cons: Double) = RichMatrix(matrix map(_  map (_ * cons)))

    def +(that: RichMatrix) = RichMatrix(sum(this.matrix, that.matrix))


    def toStr = matrix.map{
      _.map{"\t" + _}.reduceLeft(_ + _) + "\n"
    }.reduceLeft(_ + _)

    override def toString  = toStr

  }

  object RichMatrix {
    def apply(matrix:Matrix) = new RichMatrix(matrix)
  }

  println(RichMatrix(Vector(Vector(1,1,1), Vector(2,2,2))))
  println(RichMatrix(Vector(Vector(1,1), Vector(2,2))) * RichMatrix(Vector(Vector(1,1), Vector(2,2))) )
  println(RichMatrix(Vector(Vector(1,1), Vector(1,1))) + RichMatrix(Vector(Vector(1,1), Vector(1,1))) )
  println(RichMatrix(Vector(Vector(1,1), Vector(1,1))) * 2)

}
