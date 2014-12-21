package exercises.chapter17

/**
 * Created by michal on 12/21/14.
 */
object e8 extends App {
  class Pair[+T](val first: T, val second: T) {
    def replaceFirst[R >: T](newFirst: R) = new Pair[R](newFirst, second)
  }

//  class PairMutable[+T](var first: T, var second: T) {
//    def replaceFirst[R >: T](newFirst: R) { first = newFirst } // Error => R >: T can't be put in place of T
//  }

}
