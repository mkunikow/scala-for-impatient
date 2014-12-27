package exercises.chapter18

import exercises.chapter18.e2._
import org.specs2.mutable

/**
  * Created by michal on 12/24/14.
  */

class e2Spec extends mutable.Specification {
   "class Bug" should {
     "have move and show methods implemetned" in {
       val bugsy = new Bug()
       val expected = new Bug(5,-1)

       bugsy move 4 and show and then move 6 and show turn around move 5 and show mustEqual expected

     }
   }
 }
