package exercises.chapter8

/**
 * Created by michal on 11/12/14.
 */


object MainE9 extends App {
  class Creature {
    //  val range: Int = 10
    def range: Int = 10
    val env: Array[Int] = new Array[Int](range)
  }

  class Ant extends Creature {
    //  override val range = 2
    override def range = 2
  }
  println(new Ant().env.length)
}
/*
 The result is 2 when both def are used what is correct.The  overriding the getter directly (def)
  ensuring the correct overridden range value is returned to the super class during construction.
*/
