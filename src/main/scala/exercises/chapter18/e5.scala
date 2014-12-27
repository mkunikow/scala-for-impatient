package exercises.chapter18

/**
 * Created by michal on 12/25/14.
 */
object e5 extends App {
  import scala.collection.mutable.ArrayBuffer

  class Network {
    class Member(val name: String) {
      val contacts = new ArrayBuffer[Network#Member]

      override def equals(o: Any) = o match {
        case that: Member => that.name == this.name
        case _ => false
      }
    }

    private val members = new ArrayBuffer[Network#Member]
    def join(name: String) = {
      val m = new Member(name)
      members += m
      m
    }
  }
  
  val n1 = new Network
  val n2 = new Network
  val n1m1 = new n1.Member("n1m1")
  val n1m2 = new n1.Member("n1m2")
  val n2m1 = new n2.Member("n2m1")
  val n2m2 = new n2.Member("n2m2")

  {
//    This method will accept members from the same network, but reject members
//    from different ones:
    def process[M <: n.Member forSome {val n : Network}](m1: M, m2: M) = (m1, m2)
    process(n1m1, n1m2)
//    process(n1m1, n2m1) //error => different networks
  }

  {
    //the same as [Network#Member] => accepts all members from any Network object
    type NetworkMember = n.Member forSome {val n: Network}
    def process(m1: NetworkMember, m2: NetworkMember) = (m1, m2)
    
    process(n1m1, n1m1)
    process(n1m1, n2m1)
  }
}
