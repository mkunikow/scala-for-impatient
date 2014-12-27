package exercises.chapter18

import scala.annotation.tailrec

/**
 * Created by michal on 12/25/14.
 */
object e6 extends App {

  def getTheClosestIndex(arr: Array[Int], value: Int): Int Either Int =  {

    @tailrec
    def bsf(list: Array[Int], target: Int, start: Int, end: Int): Int = {
      if (list.length == 0) -1
      else if (start>end) {
       val s = if (start >= list.length) list.length - 1 else start
       val e = if (end < 0) 0 else end
       if (Math.abs(list(s) - target) < Math.abs(list(e) - target)) s else e
      } else {
        val mid = start + (end - start + 1) / 2
        list match {
          case (arr: Array[Int]) if (arr(mid) == target) => mid
          case (arr: Array[Int]) if (arr(mid) > target) => bsf(list, target, start, mid - 1)
          case (arr: Array[Int]) if (arr(mid) < target) => bsf(list, target, mid + 1, end)
        }
      }
    }

    val index = bsf(arr, value, 0, arr.length - 1)
    if (index == -1) Right(-1)
    else if (arr(index) == value) Left(index) else Right(index)

  }

}
