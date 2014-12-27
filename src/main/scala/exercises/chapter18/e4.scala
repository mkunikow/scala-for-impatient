package exercises.chapter18

/**
 * Created by michal on 12/25/14.
 */
object e4 extends App {
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

  val chatter = new Network
  val myFace = new Network
  val fred = chatter.join("Fred") // Has type chatter.Member
  val barney = myFace.join("Barney") // Has type myFace.Member
  fred.contacts += barney // Error

}
