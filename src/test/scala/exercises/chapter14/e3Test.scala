package exercises.chapter14
import exercises.chapter14.e3._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/8/14.
 */

class e3Test extends FeatureSpec with Matchers {
  feature ("function swap"){
    scenario ("should swap 2 first elements of array"){
      val input = Array(1,2,3,4)
      val expected = Array(2,1,3,4)
      swap(input) should equal(expected)
    }
  }
}
