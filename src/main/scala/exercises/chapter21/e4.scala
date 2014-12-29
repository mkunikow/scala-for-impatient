package exercises.chapter21

/**
 * Created by michal on 12/28/14.
 */
object e4 extends App {

  abstract class ReadType
  object aString extends ReadType
  object anInt extends ReadType
  object aDouble extends ReadType

  class Read(val readType: ReadType = aString, val ask: String = "") {
    def in(readType: ReadType) = Read(readType, this.ask)
    def askingFor(ask: String) = {
      print(ask + ": ")

      val value = readType match {
        case aString => io.StdIn.readLine()
        case anInt => io.StdIn.readInt()
        case aDouble => io.StdIn.readDouble()
      }
      println(s"You wrote $value")

      Read(this.readType, ask)
    }
    def and(readType: ReadType) = Read(readType, this.ask)
  }

  object Read {
    def apply(readType: ReadType = aString, ask: String = "") = new Read(readType, ask)
    def in(readType: ReadType) = Read(readType)
  }

  //Where to use implicit?

  Read in aString askingFor "Your name" and anInt askingFor "Your age" and aDouble askingFor "Your weight"

}
