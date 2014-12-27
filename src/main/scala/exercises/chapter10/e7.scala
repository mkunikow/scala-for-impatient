package exercises.chapter10

/**
 * Created by michal on 11/16/14.
 */
object e7 extends App {

  trait Performance {
    def perform(performance: String = "") = {printf(performance)}
  }

  trait Juggling  extends Performance {
    override def perform(performance: String) = {
      super.perform("juggling (" + performance + ")")
    }
  }

  trait FireBreathing  extends Performance {
    override def perform(performance: String) = {
      super.perform("fire breathing (" + performance + ")")
    }
  }

  class Person(val name:String) {
    override def toString = s"Person($name)"
  }

  class Juggler(name:String) extends Person(name) with Juggling

  val juggler = new Juggler("Ball juggler")
  println(juggler)
  println(juggler.perform())

  class JugglerFireBreathing (name:String) extends Person(name) with Juggling with FireBreathing

  val jugglerFireBreathing = new JugglerFireBreathing("Ball Juggler with fire")
  println(jugglerFireBreathing)
  jugglerFireBreathing.perform("singing")



}
