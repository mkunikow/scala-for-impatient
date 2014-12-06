package exercises.chapter13

import exercises.chapter13.e8._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/6/14.
 */

class e8Test extends FeatureSpec with Matchers {
    feature ("transformTo2dArray function"){
        scenario ("should return 2d array"){
             val input = Array(1, 2, 3, 4, 5, 6)
             val result = Array(Array(1, 2, 3),Array(4, 5, 6))

             transformTo2dArray(input, 3) should equal(result)
        }
    }
}
