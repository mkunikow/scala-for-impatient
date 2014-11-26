package exercises.chapter11

import scala.io.Source

/**
 * Created by michal on 11/24/14.
 */
object MainE6 extends App {
  class ASCIIArt(val ascii: String) {

    def +(that: ASCIIArt) =  {
      val lines = Source.fromString(ascii).getLines().toArray
      val tlines = Source.fromString(that.ascii).getLines().toArray
      val alllines = for (p <- lines.zipAll(tlines, "", "")) yield p._1 + p._2
      ASCIIArt(alllines mkString("\n"))
    }

    def ^(that: ASCIIArt) = ASCIIArt(ascii + "\n" + that.ascii)

    override def toString = ascii
  }

  object ASCIIArt {
    def apply(ascii: String) = new ASCIIArt(ascii)
  }

  val cat =
  """
      /\_/\
     ( ' ' )
     (  -  )
      | | |
     (__|__)"""

  val text =
  """
       -----
     / Hello \
    <  Scala |
     \ Coder /
       -----"""

  println(ASCIIArt(cat) + ASCIIArt(text))
  println(ASCIIArt(cat) ^ ASCIIArt(text))

}
