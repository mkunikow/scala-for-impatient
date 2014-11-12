package exercises.Chapter8

/**
 * Created by michal on 11/12/14.
 */
class Point(val x: Double, val y: Double) {
  override def toString = s"Point(x: $x, y: $y)"
}

object Point {
  def apply(x: Double, y: Double) = new Point(x, y)
}

class LabelPoint(val label: String, x: Double, y: Double ) extends Point(x, y) {
  override def toString = s"LabelPoint(label: $label, x: $x, y: $y)"
}

object maine5 extends App {
  println(new LabelPoint("Black Thursday", 1929, 230.07))
}
