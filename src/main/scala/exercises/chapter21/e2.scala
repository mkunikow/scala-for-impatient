package exercises.chapter21

/**
 * Created by michal on 12/28/14.
 */
object e2 extends App {

  object Helpers {
    implicit final class IntWithPercentage(value: Int) {
      def +% (prec: Int) = value + value / prec
    }
  }

}
