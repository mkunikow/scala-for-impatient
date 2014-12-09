package exercises.chapter14

/**
 * Created by michal on 12/8/14.
 */
object e2 extends App {

  def swap(pair: (Int, Int)): (Int, Int) = pair match {
    case (x, y) => (y, x)
  }

}
