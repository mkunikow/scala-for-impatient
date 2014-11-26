package exercises.chapter11

/**
 * Created by michal on 11/23/14.
 */
object MainE3 extends App{

  class Fraction(n: Int, d: Int) {

    private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)

    private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

    override def toString = num + "/" + den

    def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0

    def gcd(a: Int, b: Int): Int = if (b == 0) math.abs(a) else gcd(b, a % b)

    def +(that: Fraction) =
      new Fraction(num * that.den + that.num * den, den * that.den)

    def unary_- = new Fraction(-n, den)

    def -(that: Fraction) = this + -that

    def *(that: Fraction) =
      new Fraction(num * that.num, den * that.den)

    def /(that: Fraction) =
      new Fraction(num * that.den, den * that.num)
  }

  object Fraction {
    def apply (n: Int, d: Int) = new Fraction(n, d)
  }

  println(Fraction(3,9))
  println(Fraction(1,4) + Fraction(1,4))
  println(Fraction(1,3) * Fraction(1,3))
  println(Fraction(1,3) / Fraction(1,3))
  println(Fraction(2,3) - Fraction(1,3))

}
