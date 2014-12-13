package exercises.chapter15
import org.specs2.mutable

/**
 * Created by michal on 12/13/14.
 */

class e10Spec extends mutable.Specification {
  "function factorial" should {
    "should throw exception for -1" in {

      new e10().factorial(-1) must throwA[AssertionError]
    }
  }
}

