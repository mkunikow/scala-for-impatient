package exercises.chapter10

/**
 * Created by michal on 11/15/14.
 */

object e2 extends App{
  import java.awt.Point

  class OrderedPoint(x: Int, y:Int) extends Point(x, y) with math.Ordered[OrderedPoint] {
    override def toString = f"OrderedPoint($getX, $getY)"

    def compare(that: OrderedPoint): Int = if (getX < that.getX || ((getX == that.getX) && (getY < that.getY))) -1
    else if (getX == that.getX && getY == that.getY) 0
    else 1
  }

  object OrderedPoint {
    def apply(x: Int, y: Int) = new OrderedPoint(x, y)
  }

  val points = Array(OrderedPoint(1,1), OrderedPoint(0,0), OrderedPoint(1,2))
  println(points.sorted mkString(", "))

}
