package exercises.chapter18

/**
 * Created by michal on 12/24/14.
 */
object e1 extends App {

  /**
   * Mutable Bug class
   * @param x
   * @param direction
   */
  class Bug(private var x: Int = 0, private var direction: Int = 1) {
    def turn(): Bug = {direction = -direction; this}
    def move(step: Int): Bug = {x += direction * step; this}
    def show() = {toString(); this}
    override def toString() = s"Bug(x: $x, direction: $direction)"

    override def equals(o: Any) = o match {
      case that: Bug => that.direction == this.direction && that.x == this.x
      case _ => false
    }

    override def hashCode = this.direction.hashCode() + this.x.hashCode()
  }

}
