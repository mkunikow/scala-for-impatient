package exercises.chapter12

import org.specs2._
import e5._

/**
 * Created by michal on 11/29/14.
 */
class e5Spec extends mutable.Specification {
  "function largest" should {
    "yields the largest value of a function within a given sequence of inputs for fun x => 10 * x - x * x and seq 1 to 10" in {
      largest(x => 10 * x - x * x, 1 to 10)  must beEqualTo(25)
    }
  }

}
