package exercises.chapter9

/**
 * Created by michal on 11/13/14.
 */
object MainE6 extends App {
  import scala.io.Source
//  val pattern = """([^"\\]*(\\.[^"\\]*)*)""".r
//  val pattern = """"(?:\\"|.)*?"""".r
  val pattern = """([^"\\]*(\\.[^"\\]*)*)""".r
  val source =  Source.fromURL(getClass.getResource("/chapter9/e6.txt"))
  val inputString = source.mkString
  val matches = pattern.findAllIn(inputString).toArray

  println(matches mkString(" "))
  source.close()

}
