package exercises.chapter17

/**
 * Created by michal on 12/20/14.
 */
object e2 extends App {
  class Pair[T] (var first: T, var second: T) {
    def swap = {
     val tmp = first
     first = second
     second = tmp
     this
    }

    override def equals(obj:Any)= obj.isInstanceOf[Pair[T]] &&
      obj.asInstanceOf[Pair[T]].first == first &&
      obj.asInstanceOf[Pair[T]].second == second

    override def hashCode = first.hashCode() + second.hashCode()

    override def toString = s"MPair($first, $second)"

  }

}
