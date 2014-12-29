package exercises.chapter21

import org.scalatest.{Matchers, FeatureSpec}
import exercises.chapter21.e3.Helpers.IntWithFactorial

/**
 * Created by michal on 12/28/14.
 */

class e3Test extends FeatureSpec with Matchers {
  feature ("Implicit IntWithFactorial"){
    scenario ("! should return factorial of Int"){
      5.! shouldEqual 120
//      5! shouldEqual 120 => why this doesn't compile?

    }
  }
}
