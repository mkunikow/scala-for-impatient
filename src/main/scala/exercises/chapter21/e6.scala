package exercises.chapter21

/**
 * Created by michal on 12/29/14.
 */
object e6 extends App {

  object PointHelper {
    import java.awt.Point
    implicit final class LexicographicOrderedPoint(point: Point) extends Ordered[Point] {
      override def compare(that: Point): Int = 
        if (point.getX < that.getX || (point.getX == that.getX && point.getY < that.getY)) -1
        else if (point.getX == that.getX && point.getY == that.getY) 0
        else 1
    }
  }

  import java.awt.Point
  import PointHelper.LexicographicOrderedPoint

  val p1 = new Point(1,2)
  val p2 = new Point(2,2)

  println(p1 compare p2)

}
