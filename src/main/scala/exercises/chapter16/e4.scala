package exercises.chapter16

/**
 * Created by michal on 12/14/14.
 */
object e4 extends App {
  def findAllImgWithoutAlt(xhtml: xml.Elem) =
    for (img <- xhtml  \\ "img"; if !img.attribute("alt").isDefined) yield img
}
