package exercises.chapter14

import exercises.chapter14.e4._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/9/14.
 */

class e4Test extends FeatureSpec with Matchers {
  feature ("function price"){
    scenario ("should calculate price of its all sub elements"){
      val input =  Multiple(10, Article("Blackwell Toaster", 29.95))
      val expected = 299.5
      price(input) should equal(expected)
    }
  }
}
