package exercises.chapter12

/**
 * Created by michal on 11/28/14.
 */
object e1 extends App {

  def values(fun: (Int) => Int, low: Int, high: Int) = low to high map (i => (i, fun(i)))

  println(values(x => x * x, -5, 5))

}
