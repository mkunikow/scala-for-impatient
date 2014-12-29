package exercises.chapter21

import scala.annotation.tailrec

/**
 * Created by michal on 12/28/14.
 */
object e5 extends App {

  class Fraction(x: Int, y: Int) {

   @tailrec
    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    require(y != 0, "the denominator must not be 0")

    def this(x: Int) = this(x, 1)

    private val g = gcd(x, y)
    val numer = x / g
    val denom = y / g

//    def <(that: Fraction) = numer * that.denom < that.numer * denom
//    def max(that: Fraction) = if (this < that) that else this

    def +(that: Fraction) =
      new Fraction(numer * that.denom + that.numer * denom, denom * that.denom)
    def unary_- = new Fraction(-numer, denom)
    def -(that: Fraction) = this + -that
    def neg = -this

    override def toString = {
      numer + "/" + denom
    }

    override def equals(o: Any) = o match {
      case that: Fraction => that.numer == this.numer && that.denom == this.denom
      case _ => false
    }

    override def hashCode = this.numer.hashCode() + this.denom.hashCode()
  }

  object Fraction {
    def apply(x: Int, y: Int) = new Fraction(x, y)

    implicit final class OrderedFraction(fraction: Fraction) extends Ordered[Fraction] {
      override def compare(that: Fraction): Int = fraction.numer * that.denom compare that.numer * fraction.denom
    }
  }

  def smaller(left: Fraction, right: Fraction)(implicit order: Fraction => Ordered[Fraction]): Fraction =
    if (left < right) left else right

}
