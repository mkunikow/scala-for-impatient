package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e5 extends App {
  def largest(fun: (Int) => Int, inputs: Seq[Int]): Int = inputs.map(fun) max
}
