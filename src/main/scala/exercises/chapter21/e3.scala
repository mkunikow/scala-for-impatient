package exercises.chapter21

import scala.annotation.tailrec

/**
 * Created by michal on 12/28/14.
 */
object e3 extends App {
  object Helpers {
    @tailrec
    private def factorial(n:BigInt, result:BigInt):BigInt = if (n == 0) result else factorial(n-1, n * result)

    implicit final class IntWithFactorial(value: Int) {
      def ! = factorial(value, 1)
    }
  }

  import Helpers.IntWithFactorial
  println(5!)

}
