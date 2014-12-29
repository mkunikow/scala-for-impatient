package exercises.chapter21

/**
 * Created by michal on 12/29/14.
 */
object e7 extends App {
  object PointHelper {
    import java.awt.Point

    implicit final class LexicographicOrderedPoint(point: Point) extends Ordered[Point] {
      override def compare(that: Point): Int =
        if (point.getX < that.getX || (point.getX == that.getX && point.getY < that.getY)) -1
        else if (point.getX == that.getX && point.getY == that.getY) 0
        else 1
    }

    implicit final class DistanceToOriginOrderedPoint(point: Point) extends Ordered[Point] {
      override def compare(that: Point): Int = Math.sqrt(point.getX * point.getX + point.getY * point.getY) compare
        Math.sqrt(that.getX * that.getX + that.getY * that.getY)
    }
  }
}
