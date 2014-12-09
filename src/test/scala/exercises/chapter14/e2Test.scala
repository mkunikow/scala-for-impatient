package exercises.chapter14
import exercises.chapter14.e2._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/8/14.
 */


class e2Test extends FeatureSpec with Matchers {
  feature ("function swap"){
    scenario ("should swap input tuple"){
      val input = (1,2)
      val expected = (2,1)
      swap(input) should equal(expected)
    }
  }
}
