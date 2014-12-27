package exercises.chapter18

/**
 * Created by michal on 12/26/14.
 *
 */
object e9 extends App {
  abstract class Dim[T](val value: Double, val name: String) {
    protected def create(v: Double): T
    def +(other: Dim[T]) = create(value + other.value)
    override def toString() = value + " " + name
  }

  class Seconds(v: Double) extends Dim[Seconds](v, "s") {
    this: Seconds =>
    override val value = v
    override def create(v: Double) = new Seconds(v)
  }

  class Meters(v: Double) extends Dim[Seconds](v, "m") {
    override def create(v: Double) = new Seconds(v)
  }

  val s = new Seconds(10)
  val m = new Meters(20)

  //TODO illegal
  val r = m + s



}
