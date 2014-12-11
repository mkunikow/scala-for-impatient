package exercises.chapter14

/**
 * Created by michal on 12/12/14.
 */
object e10 extends App {
  def compose(f1: Double => Option[Double], f2: Double => Option[Double]): Double => Option[Double] = (x: Double) =>
    f2(x) match {
      case Some(v) => f1(v)
      case None => None
    }
}
