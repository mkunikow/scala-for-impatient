package exercises.chapter9

/**
 * Created by michal on 11/12/14.
 */

object MainE2 extends App {
  import scala.io.Source
  val source =  Source.fromURL(getClass.getResource("/chapter9/e2.txt"))
  val result = source.getLines().toArray.map(_.replace("\t", "    "))
  source.close()
  println(result.mkString("\n"))
}
