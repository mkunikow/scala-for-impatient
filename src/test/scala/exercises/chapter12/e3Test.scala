package exercises.chapter12

import org.scalatest.{Matchers, FeatureSpec}
import e3._

/**
 * Created by michal on 11/29/14.
 */
class e3Test extends FeatureSpec with Matchers {
  feature ("Factorial tests"){
    scenario ("factorial test for n = 5"){
      factorial(5) should equal (120)
    }

    scenario ("factorial test for n = 0"){
      factorial(0) should equal (1)
    }


  }
}
