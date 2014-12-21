package exercises.chapter17

import exercises.chapter17.e6._
import org.specs2.mutable

/**
 * Created by michal on 12/16/14.
 */

class e6Spec extends mutable.Specification {
  "function middle" should {
    "should return middle of Iterable[T] element" in {
      val input = "World"
      val output = 'r'

      middle(input)  must beEqualTo(output)
    }
  }
}
