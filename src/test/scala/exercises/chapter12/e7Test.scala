package exercises.chapter12

import exercises.chapter12.e7._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 11/29/14.
 */
class e7Test extends FeatureSpec with Matchers {
  feature ("Chapter12 E7 adjustToPair test"){
    scenario ("adjustToPair adjustToPair(_ * _)((6, 7)) is 42"){
      adjustToPair(_ * _)((6, 7)) should equal(42)
    }
  }
}
