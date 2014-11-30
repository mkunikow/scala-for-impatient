package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e2 extends App {

  val max = Array(2,1,33,100) reduceLeft(_ max _)
  println(max)

}
