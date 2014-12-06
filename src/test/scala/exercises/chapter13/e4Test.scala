package exercises.chapter13

import exercises.chapter13.e4._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/5/14.
 */

class e4Test extends FeatureSpec with Matchers {
    feature ("Function mapStringToInt"){
        scenario ("should map array string to corresponding array int"){
            mapStringToInt(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)) should equal(Array(3, 5))
        }
    }

    feature ("Function mapStringToIntFlatMap"){
        scenario ("should map array string to corresponding array int"){
            mapStringToIntFlatMap(Array("Tom", "Fred", "Harry"), Map("Tom" -> 3, "Dick" -> 4, "Harry" -> 5)) should equal(Array(3, 5))
        }
    }
}

