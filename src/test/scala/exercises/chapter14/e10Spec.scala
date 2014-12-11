package exercises.chapter14
import exercises.chapter14.e10._
import org.specs2.mutable

/**
 * Created by michal on 12/12/14.
 */


class e10Spec extends mutable.Specification {
  "function compose" should {
    "should return composition of two functions" in {
      def f(x: Double) = if (x >= 0) Some(Math.sqrt(x)) else None
      def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
      val h = compose(f, g)

      val input = 2
      val output = Some(1)

      h(input) must beEqualTo(output)
    }
    "should return None if either functions return None" in {
      def f(x: Double) = if (x >= 0) Some(Math.sqrt(x)) else None
      def g(x: Double) = if (x != 1) Some(1 / (x - 1)) else None
      val h = compose(f, g)

      val input = 1
      val output = None

      h(input) must beEqualTo(output)
    }
  }
}
