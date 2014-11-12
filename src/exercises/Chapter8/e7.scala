package exercises.Chapter8

/**
 * Created by michal on 11/12/14.
 */

import java.awt.{Rectangle => AwtRectangle}


class Square(x: Int, y: Int, width: Int) extends AwtRectangle(x, y, width, width) {
  def this() = this(0, 0, 0)
  def this(width: Int) = this(0, 0, width)
}

object maine7 extends App{
  println(new Square(1,1,2))
  println(new Square(3))
  println(new Square())
}
