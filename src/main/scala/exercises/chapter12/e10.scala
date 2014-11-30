package exercises.chapter12

/**
 * Created by michal on 11/30/14.
 */
object e10 extends App {

  def unless(condition: => Boolean)(block: => Unit): Unit = {
    if (!condition) {
      block
    }
  }

  unless(false){println("Unless")}

}
