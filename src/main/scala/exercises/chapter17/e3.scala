package exercises.chapter17

/**
 * Created by michal on 12/20/14.
 */
object e3 extends App {

  class Pair[S,T] (val first: T, val second: S) {

    override def equals(obj:Any)= obj.isInstanceOf[Pair[S,T]] &&
      obj.asInstanceOf[Pair[S, T]].first == first &&
      obj.asInstanceOf[Pair[S, T]].second == second

    override def hashCode = first.hashCode() + second.hashCode()

    override def toString = s"MPair($first, $second)"

  }

  def swap[S,T](pair: Pair[S, T]): Pair[T, S] = new Pair[T,S](pair.second, pair.first)

}
