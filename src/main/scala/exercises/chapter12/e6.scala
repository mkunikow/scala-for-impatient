package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object  e6 extends App {
  def largestAt(fun: (Int) => Int, inputs: Seq[Int]): Int = inputs.maxBy(fun)
}
