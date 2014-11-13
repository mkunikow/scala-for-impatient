package exercises.chapter9

/**
 * Created by michal on 11/13/14.
 */

object MainE4 extends App {
  import scala.io.Source
  val pattern = """[-+]?[0-9]*\.?[0-9]*"""
  val source =  Source.fromURL(getClass.getResource("/chapter9/e4.txt"))
  val numbers = source.mkString.split("\\s+").filter(_.matches(pattern)).map(_.toDouble)
  source.close()
  println("sum: " + numbers.sum + ", avg: " + numbers.sum / numbers.length + ", max: " + numbers.max + ", min: " + numbers.min)
}
