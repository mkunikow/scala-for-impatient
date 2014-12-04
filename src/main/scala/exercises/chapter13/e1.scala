package exercises.chapter13

import scala.collection.mutable

/**
 * Created by michal on 12/4/14.
 */
object e1 extends App {
  val indexes = mutable.Map[Char, Set[Int]]()
  for ((c, i) <- "Mississippi".zipWithIndex) indexes(c) = indexes.getOrElse(c, Set()) + i
  println(indexes)
}
