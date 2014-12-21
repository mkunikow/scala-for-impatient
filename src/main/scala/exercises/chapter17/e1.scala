package exercises.chapter17

/**
 * Created by michal on 12/19/14.
 */
object e1 extends App {

  class Pair[S,T] (val first: T, val second: S) {
    def swap = new Pair[T,S](second, first)

    override def equals(obj:Any)= obj.isInstanceOf[Pair[S,T]] &&
      obj.asInstanceOf[Pair[S, T]].first == first &&
      obj.asInstanceOf[Pair[S, T]].second == second

    override def hashCode = first.hashCode() + second.hashCode()

    override def toString = s"MPair($first, $second)"

  }

}
