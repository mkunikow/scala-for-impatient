package exercises.chapter21

import java.awt.Point

import org.scalatest.{Matchers, FeatureSpec}

/**
 * Created by michal on 12/29/14.
 */

class e7Test extends FeatureSpec with Matchers {
  feature ("Function compare"){
    scenario ("should compare two java.awt.Point by lexicographic"){
      import exercises.chapter21.e6.PointHelper.LexicographicOrderedPoint
      val point1 = new Point(1,2)
      val point2 = new Point(2,2)
      point1 compare point2 shouldEqual -1
      point2 compare point1 shouldEqual 1
      point2 compare point2 shouldEqual 0
    }
    scenario ("should compare two java.awt.Point by distance to origin"){
      import exercises.chapter21.e7.PointHelper.DistanceToOriginOrderedPoint
      val point1 = new Point(1,2)
      val point3 = new Point(2,1)
      val point2 = new Point(2,2)
      point1 compare point2 shouldEqual -1
      point2 compare point1 shouldEqual 1
      point2 compare point2 shouldEqual 0
      point1 compare point3 shouldEqual 0
    }
  }
}
