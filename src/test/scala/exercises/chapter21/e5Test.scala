package exercises.chapter21

import org.scalatest.{Matchers, FeatureSpec}
import exercises.chapter21.e5.{Fraction, smaller}

/**
 * Created by michal on 12/28/14.
 */

class e5Test extends FeatureSpec with Matchers {
  feature ("Function smaller"){
    scenario ("should return smaller fraction"){
      smaller(Fraction(1, 5), Fraction(4,5)) shouldEqual Fraction(1,5)
    }
  }
}
