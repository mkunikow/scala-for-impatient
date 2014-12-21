package exercises.chapter17

import exercises.chapter17.e2._
import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/20/14.
 */


class e2Test extends FeatureSpec with Matchers {
  feature ("function swap of Pair class"){
    scenario ("should return new swapped pair"){
      val p = new Pair(1, "test")
      val expected = new Pair("test", 1)
      p.swap should equal(expected)
    }
  }
}
