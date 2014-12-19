package exercises.chapter16

import exercises.chapter16.e8._
import org.specs2.mutable

/**
 * Created by michal on 12/16/14.
 */

class e8Spec extends mutable.Specification {
  "function convertXMLToDl" should {
    "should convert xml to dl" in {

      val expected = Map("A" -> "1", "B" -> "2")
      val input = <dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>

      convertXMLToDl(input) must equalTo(expected)
    }
  }
}
