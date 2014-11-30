package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e4 extends App {

  def factorial(n: Int): Int = (1 to n).foldLeft(1)(_ * _)


  println(factorial(0))

}
