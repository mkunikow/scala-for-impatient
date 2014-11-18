package exercises.chapter10

/**
 * Created by michal on 11/15/14.
 */
object MainE4 extends App {

  /**
   * Code taken from http://rosettacode.org/wiki/Caesar_cipher#Scala
   */
  object Caesar {
    private val alphaU='A' to 'Z'
    private val alphaL='a' to 'z'

    def encode(text:String, key:Int)=text.map{
      case c if alphaU.contains(c) => rot(alphaU, c, key)
      case c if alphaL.contains(c) => rot(alphaL, c, key)
      case c => c
    }
    def decode(text:String, key:Int)=encode(text,-key)
    private def rot(a:IndexedSeq[Char], c:Char, key:Int)=a((c-a.head+key+a.size)%a.size)
  }

  trait Logger {
    def log(msg: String): Unit // An abstract method
  }

  trait CryptoLogger extends Logger {
    val key = 3
    abstract override def log(msg: String) = super.log(Caesar.encode(msg, key))
  }

  class ConsoleLogger extends Logger { // Use extends, not implements
    def log(msg: String) = println(msg)  // No override needed
  }

  val loggerWithDefaultKey = new ConsoleLogger with CryptoLogger
  println(loggerWithDefaultKey.log("Test message"))

  val loggerWithCustomKey = new {override val key = -3} with ConsoleLogger with CryptoLogger
  println(loggerWithCustomKey.log("Test message"))

}
