package exercises.chapter13

/**
 * Created by michal on 12/5/14.
 */
object e5 extends App {
    def mkStringFlatMap(seq: Seq[String], start: String = "", sep: String = "", end: String = ""): String =
        start + seq.reduceLeft(_ + sep + _) + end
}
