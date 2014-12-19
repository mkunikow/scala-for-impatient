package exercises.chapter16

import scala.xml.transform.{RewriteRule, RuleTransformer}

/**
 * Created by michal on 12/16/14.
 */
object e9 extends App {
  def transformXML(xhtml: xml.Elem): Seq[scala.xml.Node] =  {
    val rule = new RewriteRule {
      override def transform(n: xml.Node) = n match {
        case e @ <img/> if !e.attribute("alt").isDefined =>
          e.asInstanceOf[xml.Elem] % new xml.UnprefixedAttribute("alt", "TODO", xml.Null)
        case _ => n
      }
    }
    new RuleTransformer(rule).transform(xhtml)
  }

}
