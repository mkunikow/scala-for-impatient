package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e8 extends App {
  val a = Array("Hello", "World")
  val b = Array(5, 5)

  println(a.corresponds(b)(_.length == _))

}
