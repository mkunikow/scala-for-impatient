package exercises.chapter17

/**
 * Created by michal on 12/21/14.
 */
object e10 extends App {
  class Pair[S,T] (val first: T, val second: S) {

    def swap()(implicit ev: T =:= S): Pair[T,S] = new Pair[T, S](second, first)

    override def equals(obj:Any)= obj.isInstanceOf[Pair[S,T]] &&
      obj.asInstanceOf[Pair[S, T]].first == first &&
      obj.asInstanceOf[Pair[S, T]].second == second

    override def hashCode = first.hashCode() + second.hashCode()
    override def toString = s"MPair($first, $second)"

  }

  val p1 = new Pair(1,2)
  val p2 = new Pair(1, "2")
  p1.swap()
//  p2.swap() // Compilation error

}
