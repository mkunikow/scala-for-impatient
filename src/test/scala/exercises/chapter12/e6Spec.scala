package exercises.chapter12

import org.specs2._
import e6._

/**
 * Created by michal on 11/29/14.
 */


class e6Spec extends mutable.Specification {
  "function largestAt" should {
    "should return the input at which the output is largest of inputs for fun x=> 2 * x and seq 1 to 10" in {
      largestAt(x => 2 * x, 1 to 10)  must beEqualTo(10)
    }
  }
}
