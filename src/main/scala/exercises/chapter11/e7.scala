package exercises.chapter11

/**
 * Created by michal on 11/24/14.
 */
object MainE7 extends App {
  class BitSequence(private var bits:Long = 0) {
    def apply(index: Int):Boolean = (bits & (1L << index % 64)) > 0
    def update(index:Int, value:Boolean) = bits = if (value) bits | (1L << index % 64) else bits & ~(1L << index % 64)
    override def toString = "%64s".format(bits.toBinaryString).replace(" ", "0")
  }

  val flags = new BitSequence()

//  flags(2) = true
  flags(54) = true
//  flags(64) = true
//
  println(flags(54))
  println(flags)

}
