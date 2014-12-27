package exercises.chapter18

import exercises.chapter18.e4._
import org.specs2.mutable

/**
 * Created by michal on 12/25/14.
 */

class e4Spec extends mutable.Specification {
  "class network" should {
    "for two network members in the same network equals should return true" in {
      val chatter = new Network
      val m1  = new chatter.Member("M1")
      val m2 = new chatter.Member("M1")
      m1 mustEqual m2
    }
  }
  "for two network members in different network equals should return false" in {
    val chatter = new Network
    val myFace = new Network
    val m1  = new chatter.Member("M1")
    val m2 = new myFace.Member("M1")
    m1 mustNotEqual m2
  }
}
