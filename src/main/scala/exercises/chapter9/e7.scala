package exercises.chapter9

/**
 * Created by michal on 11/13/14.
 */

object MainE7 extends App{
  import scala.io.Source
  val pattern = """[-+]?[0-9]*\.?[0-9]*"""
  val source =  Source.fromURL(getClass.getResource("/chapter9/e7.txt"))
  val tokens = source.mkString.split("\\s+").filterNot(_.matches(pattern))
  println(tokens mkString(""))

}
