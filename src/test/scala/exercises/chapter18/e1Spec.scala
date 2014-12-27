package exercises.chapter18

import exercises.chapter18.e1._
import org.specs2.mutable

/**
 * Created by michal on 12/24/14.
 */

class e1Spec extends mutable.Specification {
  "class Bug" should {
    "have move and show methods implemetned" in {
      val bugsy = new Bug()
      val expected = new Bug(5,-1)

      bugsy.move(4).show().move(6).show().turn().move(5).show() must beEqualTo(expected)
    }
  }
}
