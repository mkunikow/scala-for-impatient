package exercises.chapter18

/**
 * Created by michal on 12/24/14.
 */

object e2 extends App {

  object show
  object then
  object around


  /**
   * Mutable Bug class, fluent interface
   * @param x
   * @param direction
   */
  class Bug(private var x: Int = 0, private var direction: Int = 1) {
    private def _turn(): Bug = {direction = -direction; this}
    def move(step: Int): Bug = {x += direction * step; this}
    private def _show() = {toString(); this}
    override def toString() = s"Bug(x: $x, direction: $direction)"

    override def equals(o: Any) = o match {
      case that: Bug => that.direction == this.direction && that.x == this.x
      case _ => false
    }

    override def hashCode = this.direction.hashCode() + this.x.hashCode()

    def and(showObj: show.type)  = _show()
    def and(thenObj: then.type) = this
    def turn(aroundObj: around.type): Bug = this._turn()

  }

}
