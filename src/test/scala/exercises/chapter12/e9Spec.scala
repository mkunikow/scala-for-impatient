package exercises.chapter12

import exercises.chapter12.e9._
import org.specs2.mutable

/**
 * Created by michal on 11/30/14.
 */

class e9Spec extends mutable.Specification {
  "function correspondsNoCurrying" should {
    "should return true" in {
      val a = Array("Hello", "beautyful", "world", "!")
      val b = a.map(_.length)

      correspondsNoCurrying(a, b, (x: String, y: Int) => x.length == y)  must beEqualTo(true)
    }
  }
}
