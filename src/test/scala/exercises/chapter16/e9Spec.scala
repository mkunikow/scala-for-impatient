package exercises.chapter16

import exercises.chapter16.e9._
import org.specs2.mutable

/**
 * Created by michal on 12/16/14.
 */

class e9Spec extends mutable.Specification {
  "function transformXML " should {
    "an XHTML document by adding an alt=\"TODO\" attribute to all img\nelements without an alt attribute, preserving everything else" in {

      val input = <html><img alt="desc" src="hamster_1.jpg"/><img src="hamster_2.jpg"/></html>
      val expected = <html><img alt="desc" src="hamster_1.jpg"/><img alt="TODO" src="hamster_2.jpg"/></html>

      transformXML(input) must equalTo(expected)
    }
  }
}
