package exercises.chapter11

/**
 * Created by michal on 11/23/14.
 */
object MainE4 extends App {

  class Money(dollars: Int, cents: Int) {

    def this(cents: Int) = this(0, cents)

    private val dollarToCentsRatio: Int = 100

    private val totalCents = dollars * dollarToCentsRatio + cents

    def +(that: Money) = new Money(totalCents + that.totalCents)

    def -(that: Money) = new Money(totalCents - that.totalCents)

    override def toString = "Money(" + totalCents / dollarToCentsRatio +"$, "+ totalCents % dollarToCentsRatio+"¢)"
  }

  object Money {
    def apply(dollars: Int, cents: Int) = new Money(dollars, cents)
  }

  println(Money(100, 50))
  println(Money(100, 150))
  println(Money(100, 50) + Money(110, 40))
  println(Money(100, 50) - Money(110, 40))

}
