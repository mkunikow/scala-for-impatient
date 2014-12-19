package exercises.chapter16

/**
 * Created by michal on 12/16/14.
 */
object e8 extends App {

  def convertXMLToDl(dlxml: xml.Elem): Map[String, String] =
    ((dlxml \\ "dt").map(_.text) zip (dlxml \\ "dd").map(_.text)).toMap
}
