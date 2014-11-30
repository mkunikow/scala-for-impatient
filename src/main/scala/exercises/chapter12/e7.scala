package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e7 extends App {
  def adjustToPair(fun: (Int, Int) => Int)(input: (Int, Int)) =  fun(input._1, input._2)

  val pairs = (1 to 10) zip (11 to 20)
  println(pairs.map(adjustToPair(_ + _)))

}
