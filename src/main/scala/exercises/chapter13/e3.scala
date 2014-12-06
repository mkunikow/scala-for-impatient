package exercises.chapter13

import scala.collection.mutable

/**
 * Created by michal on 12/5/14.
 */
object e3 extends App {
    val b = mutable.LinkedList(1, 0, 0, 0, 1, 2, 3, 3)
    println(b.filter(_ > 0))

}
