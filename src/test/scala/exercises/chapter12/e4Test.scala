package exercises.chapter12

import org.scalatest.{Matchers, FeatureSpec}
import e4._

/**
 * Created by michal on 11/29/14.
 */
class e4Test extends FeatureSpec with Matchers {
  feature ("Chapter12 E4 Factorial tests"){
    scenario ("factorial test for n = 5"){
      factorial(5) should equal (120)
    }

    scenario ("factorial test for n = 0"){
      factorial(0) should equal (1)
    }

  }
}
