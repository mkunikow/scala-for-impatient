package exercises.chapter14

/**
 * Created by michal on 12/9/14.
 */
object e5 extends App {


  def leafSum(list: List[Any]): Int = list match {
    case Nil => 0
    case (h:Int) :: tail => h + leafSum(tail)
    case (l: List[Any]) :: tail => leafSum(l) + leafSum(tail)
    case (h:Any) :: tail => throw new IllegalArgumentException
  }
}