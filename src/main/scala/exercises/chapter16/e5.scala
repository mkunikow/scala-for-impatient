package exercises.chapter16

/**
 * Created by michal on 12/15/14.
 */
object e5 extends App {

  val xhtml =
    <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
      <head>
        <title>
          Wikibooks
        </title>
      </head>
      <body>
        <img src="img1.jpg"/>
        <img src="img2.jpg"/>
        <p>
          Wikibooks is a great website.
        </p>
        <img alt="TODO" src="hamster.jpg"/>
      </body>
    </html>

  def getAllImgSrc(xhtml: xml.Elem) =
    for(img <- xhtml \\ "img"; if img.attribute("src").isDefined) yield img.attribute("src").getOrElse("")


  def getAllImgSrcUsingMap(xhtml: xml.Elem) = (xhtml  \\ "img" \\ "@src")

  def getAllImgSrcUsingMap2(xhtml: xml.Elem) = (xhtml  \\ "img").map(_ \ "@src")

  println(getAllImgSrc(xhtml).mkString(" "))
  println(getAllImgSrcUsingMap(xhtml).mkString(" "))
  println(getAllImgSrcUsingMap2(xhtml).mkString(" "))

}
