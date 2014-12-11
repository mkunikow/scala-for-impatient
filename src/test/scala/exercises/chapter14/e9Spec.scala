package exercises.chapter14

import exercises.chapter14.e9._
import org.specs2.mutable

/**
 * Created by michal on 12/11/14.
 */

class e9Spec extends mutable.Specification {
  "function listOptionSumFlatten" should {
    "should return sum of none empty elements" in {
      val input = List(Some(3), Some(2), None)
      val output = 5

      listOptionSumFlatten(input)  must beEqualTo(output)
    }
  }

  "function listOptionSumReduceLeft" should {
    "should return sum of none empty elements" in {
      val input = List(Some(3), Some(2), None)
      val output = 5

      listOptionSumFoldLeft(input)  must beEqualTo(output)
    }
  }
}
