package exercises.chapter10

/**
 * Created by michal on 11/15/14.
 */

object e1 extends App {

  trait RectangleLike {
    def getX: Double
    def getY: Double
    def getHeight: Double
    def getWidth: Double
    def setFrame(x: Double, y: Double, w: Double, h: Double)

    /**
     * Translates this Rectangle the indicated distance, to the right along the X coordinate axis, and downward along the Y coordinate axis.
     * @param dx the distance to move this Rectangle along the X axis
     * @param dy the distance to move this Rectangle along the Y axis
     */
    def translate(dx: Double, dy: Double) = setFrame(getX + dx, getY + dy, getWidth , getHeight)

    /**
     * Resizes the Rectangle both horizontally and vertically.
     * This method modifies the Rectangle so that it is h units larger on both the left and right side, and v units larger at both the top and bottom.
     * The new Rectangle has (x - h, y - v) as its upper-left corner, width of (width + 2h), and a height of (height + 2v).
     * @param h the horizontal expansion
     * @param v the vertical expansion
     */
    def grow(h: Int,v: Int) = setFrame(getX - h, getY - v, getWidth + 2 * h, getHeight + 2 * v)

    override def toString = f"RectangleLike($getX, $getY, $getWidth, $getHeight)"
  }

  val egg = new java.awt.geom.Ellipse2D.Double(5, 10, 20, 30) with RectangleLike
  println(egg)

  egg.translate(10, -10)
  println(egg)

  egg.grow(10, 20)
  println(egg)

}
