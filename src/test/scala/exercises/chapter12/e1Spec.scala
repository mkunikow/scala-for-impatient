package exercises.chapter12

import org.specs2.mutable

/**
 * Created by michal on 11/29/14.
 */
class e1Spec extends mutable.Specification {
  "function values" should {
    "should return vector" in {
      e1.values(x  => x * x, -5, 5)  must beEqualTo(Vector((-5,25), (-4,16), (-3,9), (-2,4), (-1,1), (0,0), (1,1), (2,4), (3,9), (4,16), (5,25)))
    }
  }

}
