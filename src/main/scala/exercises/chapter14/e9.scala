package exercises.chapter14

/**
 * Created by michal on 12/11/14.
 */
object e9 extends App {
  def listOptionSumFlatten(list: List[Option[Int]]): Int = list.flatten.sum
  def listOptionSumFoldLeft(list: List[Option[Int]]): Int = (0 /: list)(_ + _.getOrElse(0))
}
