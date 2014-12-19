package exercises.chapter16

import exercises.chapter16.e4._
import org.specs2.mutable

/**
 * Created by michal on 12/15/14.
 */

class e4Spec extends mutable.Specification {
  "function findAllImgWithoutAlt" should {
    "should return all img without alt" in {

        val input = <html>
          <head>
            <title>
              Wikibooks
            </title>
          </head>
          <body>
            <img src="hamster_no_alt.jpg"/>
            <p>
              Wikibooks is a great website.
            </p>
            <img alt="TODO" src="hamster.jpg"/>
          </body>
        </html>

       val expected = <img src="hamster_no_alt.jpg"/>

      findAllImgWithoutAlt(input).head must beEqualTo(expected)
    }
  }
}
