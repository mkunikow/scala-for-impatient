package exercises.chapter21

import exercises.chapter21.e2.Helpers.IntWithPercentage
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/28/14.
 */

class e2Test extends FeatureSpec with Matchers {
  feature ("Implicit conversion Int to PercentageInt"){
    scenario ("+% should add percentage to Int"){
      120 +% 10 shouldEqual 132
    }
  }
}
