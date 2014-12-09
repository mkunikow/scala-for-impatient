package exercises.chapter14

/**
 * Created by michal on 12/8/14.
 */
object e3 extends App {
  def swap(arr: Array[Int]) = arr match {
    case Array(x, y, z @ _*) => Array(y, x) ++ z
    case _ => arr
  }

}
