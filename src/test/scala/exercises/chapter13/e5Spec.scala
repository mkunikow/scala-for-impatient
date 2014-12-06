package exercises.chapter13

import exercises.chapter13.e5._
import org.specs2.mutable

/**
 * Created by michal on 12/5/14.
 */

class e5Spec extends mutable.Specification {
    "function mkStringFlatMap" should {
        "should return the same as mkString" in {
            val input = Array("Hello", "beautyful", "world", "!")
            val output = input.mkString

            mkStringFlatMap(input)  must beEqualTo(output)
        }
    }
    "should return the same as mkString with prefix, seperator and postfix" in {
        val input = Array("Hello", "beautyful", "world", "!")
        val output = input.mkString("prefix", "-", "postfix")

        mkStringFlatMap(input, "prefix", "-", "postfix")  must beEqualTo(output)
    }
}
