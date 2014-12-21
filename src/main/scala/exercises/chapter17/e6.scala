package exercises.chapter17

/**
 * Created by michal on 12/21/14.
 */
object e6 extends App {
  def middle[T](it: Iterable[T]): T = it.drop((it.size - 1)/2).head
}
