package exercises.chapter8

/**
 * Created by michal on 11/12/14.
 */

object MainE6 extends App {

  class Point(val x: Double, val y: Double) {
    override def toString = s"Point(x: $x, y: $y)"
  }

  object Point {
    def apply(x: Double, y: Double) = new Point(x, y)
  }

  abstract class Shape {
    def centerPoint: Point
  }

  class Rectangle(val topLeft: Point, val bottomRight: Point) extends Shape {
    override def centerPoint = Point((topLeft.x + bottomRight.x) / 2, (topLeft.y + bottomRight.y) / 2)
    override def toString = s"Rectangle(topLeft: $topLeft,  bottomRight: $bottomRight) centerPoint: $centerPoint"
  }

  class Circle(val centerPoint: Point, val radius: Int) extends Shape {
    override def toString = s"Circle(centerPoint: $centerPoint , radius: $radius)"
  }
  println(new Rectangle(Point(0,0), Point(2,4)))
  println(new Circle(Point(0,0), 5))
}
