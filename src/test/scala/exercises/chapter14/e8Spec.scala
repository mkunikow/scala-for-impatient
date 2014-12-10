package exercises.chapter14

import exercises.chapter14.e8._
import org.specs2.mutable

/**
 * Created by michal on 12/10/14.
 */

class e8Spec extends mutable.Specification {
  "function leafSum" should {
    "should return sum of tree leafs" in {
      val input = Node("+", Node("*", Leaf(3), Leaf(8)), Leaf(2),  Node("-", Leaf(5)))
      val output = (3 * 8) + 2 + (-5)

      eval(input)  must beEqualTo(output)
    }
  }
}
