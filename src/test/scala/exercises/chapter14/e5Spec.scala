package exercises.chapter14

import exercises.chapter14.e5._
import org.specs2.mutable

/**
 * Created by michal on 12/9/14.
 */

class e5Spec extends mutable.Specification {
  "function leafSum" should {
    "should return sum of tree leafs" in {
      val input = List(List(3, 8), 2,  List(5))
      val output = 3 * 8 * 2 * 5

      leafSum(input)  must beEqualTo(output)
    }
  }
}
