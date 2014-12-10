package exercises.chapter14

import exercises.chapter14.e7._
import org.specs2.mutable

/**
 * Created by michal on 12/10/14.
 */

class e7Spec extends mutable.Specification {
  "function leafSum" should {
    "should return sum of tree leafs" in {
      val input = Node(Node(Leaf(1), Leaf(2)), Node(Leaf(3), Leaf(4), Leaf(5)))
      val output = 15

      leafSum(input)  must beEqualTo(output)
    }
  }
}


