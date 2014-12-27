package exercises.chapter18

import exercises.chapter18.e3._
import org.specs2.mutable

/**
 * Created by michal on 12/24/14.
 */

class e3Spec extends mutable.Specification {
  "class Book" should {
    "have set and to methods implemented" in {
      val book = new Document()
      val expected = new Document(title = "Scala for the Impatient", author =  "Cay Horstmann")

      book set Title to "Scala for the Impatient" set Author to "Cay Horstmann" mustEqual expected

    }
  }
}
