package exercises.chapter13

/**
 * Created by michal on 12/4/14.
 */
object e2 extends App {
  val indexes = "Mississippi".zipWithIndex.foldLeft(Map[Char, Set[Int]]()){(m, i) => m + (i._1 -> (m.getOrElse(i._1, Set()) + i._2))}
  println(indexes)
}
