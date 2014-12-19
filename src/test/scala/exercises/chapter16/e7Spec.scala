package exercises.chapter16

import exercises.chapter16.e7._
import org.specs2.mutable

/**
 * Created by michal on 12/15/14.
 */


class e7Spec extends mutable.Specification {
  "function create Dl" should {
    "should return dl for input map" in {

      val input = Map("A" -> "1", "B" -> "2")
      val expected = <dl><dt>A</dt><dd>1</dd><dt>B</dt><dd>2</dd></dl>

      convertDlToXML(input) must equalTo(expected)
    }
  }
}
