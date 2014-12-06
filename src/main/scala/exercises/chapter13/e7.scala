package exercises.chapter13

/**
 * Created by michal on 12/6/14.
 */
object e7 extends App {
    val prices = List(5.0, 20.0, 9.95)
    val quantities = List(10, 2, 1)

    val r = (prices zip quantities) map { p => p._1 * p._2 }
    val r2 = (prices zip quantities) map { Function.tupled(_ * _)}
    val r3 = (prices zip quantities) map { case (x, y) => x * y}

    println(r)
    println(r2)
    println(r3)
}
