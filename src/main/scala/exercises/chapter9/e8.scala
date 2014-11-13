package exercises.chapter9

/**
 * Created by michal on 11/13/14.
 */
object MainE8 extends App {
  val testInputImg = """<img src="giant-prawn.jpg" alt="The Giant Prawn at Ballina"/>"""
  val pattern = """<img.+?src=[\"'](.+?)[\"'].*?>""".r

  for (pattern(src) <- pattern.findAllIn(testInputImg)) println(src)

}
