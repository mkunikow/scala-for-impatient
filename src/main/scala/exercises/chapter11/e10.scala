package exercises.chapter11

/**
 * Created by michal on 11/28/14.
 */
object MainE10 extends App {

  object RichFile {
    def unapplySeq(s: String): Option[Seq[String]] = {
      if (s.trim == "") None else Some(s.trim.split("/"))
    }
  }

  val RichFile(first, last, third) = "home/cay/readme.txt"
  println(s"first: $first, last: $last, third: $third")
}
