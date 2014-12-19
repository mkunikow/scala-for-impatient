package exercises.chapter16

/**
 * Created by michal on 12/15/14.
 */
object e7 extends App {

  def convertDlToXML(map: Map[String, String]): xml.Elem = <dl>{for((k,v) <- map) yield <dt>{k}</dt><dd>{v}</dd>}</dl>

}
