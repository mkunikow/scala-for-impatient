package exercises.chapter16

/**
 * Created by michal on 12/15/14.
 */
object e6 extends App {


  val url = getClass.getResource("/chapter16/e6.xtml").getPath
  val xhtml = scala.xml.XML.loadFile(url)

  def getAllHref(xhtml: xml.Node) = (xhtml \\ "a").map(x => (x.text, x \ "@href"))

  println(getAllHref(xhtml))

}
