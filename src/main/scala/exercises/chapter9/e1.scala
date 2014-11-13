package exercises.chapter9

/**
 * Created by michal on 11/12/14.
 */

object  MainE1 extends App {
  import scala.io.Source
  val source =  Source.fromURL(getClass.getResource("/chapter9/e1.txt"))
  val reverse = source.getLines().toArray.reverse
  source.close()
  println(reverse mkString(" "))
}
