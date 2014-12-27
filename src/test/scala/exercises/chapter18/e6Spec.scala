package exercises.chapter18

import exercises.chapter18.e6._
import org.specs2.mutable

/**
 * Created by michal on 12/25/14.
 */

class e6Spec extends mutable.Specification {
  "function getTheClosestIndex" should {
    "should return index for existing value" in {
      val arr = Array(0,1,2,3,4,5,6,7,8)
      getTheClosestIndex(arr, 8) shouldEqual Left(8)
    }
  }
  "function getTheClosestIndex" should {
    "should return the closes index for no existing value" in {
      val arr = Array(0,1,2,3,4,5,6,7,8)
      getTheClosestIndex(arr, 9) shouldEqual Right(8)
    }
  }
  "function getTheClosestIndex" should {
    "should return -1 for empty list" in {
      val arr = Array[Int]()
      getTheClosestIndex(arr, 9) shouldEqual Right(-1)
    }
  }
}
