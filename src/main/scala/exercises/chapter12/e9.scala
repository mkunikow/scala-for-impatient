package exercises.chapter12

/**
 * Created by michal on 11/29/14.
 */
object e9 extends App {

  def correspondsNoCurrying[B, A](from: Seq[A], to: Seq[B], p: (A, B) => Boolean): Boolean = (from zip to).forall(x => p(x._1, x._2))
}
