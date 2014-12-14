package exercises.chapter16

/**
 * Created by michal on 12/14/14.
 */
object e4 extends App {
  val xhtml =
    <html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
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


  val r = for (img <- xhtml  \\ "img"; if img.attribute("alt").size == 0 ) yield img
  println(r)


}
