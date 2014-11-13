package object random {

  private val a: Int = 1664525
  private val b: Int = 1013904223
  private val n: Int = 32

  private var seed: Int = 0
  private var previous: Int = seed

  def nextInt(): Int = {
    import scala.math.pow

    seed = (seed * a + b) % pow(2,n).toInt
    seed
  }

  def nextDouble(): Double = 1.0 / nextInt()

  def setSeed(seed: Int): Unit = {
    this.seed = seed
    this.previous = seed
  }

}

object e3main extends App{
  random.setSeed(100)
  println(random.nextInt)
  println(random.nextInt)
  println(random.nextDouble)
}
