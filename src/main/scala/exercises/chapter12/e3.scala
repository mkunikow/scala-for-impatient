package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e3 extends App {

   def factorial(n: Int) = {
     if (n > 0) 1 to n reduceLeft (_ * _)
     else if (n == 0) 1
   }

  println(factorial(3))

}
