package exercises.chapter21

/**
 * Created by michal on 12/29/14.
 */
object e10 extends App {
  val r1: String = "abc".map(_.toUpper)
  val r2: Seq[Int] = "abc".map(_.toInt) //scala.collection.immutable.IndexedSeq[Int] = Vector(97, 98, 99)

}
