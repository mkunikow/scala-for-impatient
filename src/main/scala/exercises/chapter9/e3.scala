package exercises.chapter9

/**
 * Created by michal on 11/12/14.
 */
object MainE3 extends App {
  import scala.io.Source
  val source =  Source.fromURL(getClass.getResource("/chapter9/e3.txt"))
  val result = source.getLines().toArray.flatMap(_.split("\\s+")).filter(_.size > 12)
  source.close()
  println(result mkString(" "))

}
