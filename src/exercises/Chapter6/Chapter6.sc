val i = 1

//1
object Conversions {
  def inchesToCentimeters(inch: Int): Double  = 2.54 * inch
  def gallonsToLiters(gallon: Int): Double = 3.78541 * gallon
  def milesToKilometers(mile: Int): Double = 1.60934 * mile
}

println(Conversions.inchesToCentimeters(10))
println(Conversions.gallonsToLiters(10))
println(Conversions.milesToKilometers(10))
//2
abstract class UnitConversion(val ratio: Double)  {
  def convert(amount: Double) = amount * ratio
}
object InchesToCentimeters extends UnitConversion(2.54)
object GallonsToLiters extends UnitConversion(3.78541)
object MilesToKilometers extends UnitConversion(1.60934)
println(InchesToCentimeters.convert(10))
println(GallonsToLiters.convert(10))
println(MilesToKilometers .convert(10))
//3
class Origin extends java.awt.Point
//java.awr.Point has mutable methods?
//4
class Point(x: Int, y: Int) {
  override def toString():String = "Point(x:" + x + ",y:" + y + ")"
}
object Point {
  def apply(x:Int, y:Int) = new Point(x, y)
}
Point(1,2)

//5
object InnerApp extends App {
  println(args.reverse.mkString(" "))
}
InnerApp.main(Array("1", "2", "3", "4", "5"))

//6
object CardsSuits extends Enumeration {
  type CardsSuits = Value
  val Heart = Value("♥")
  val Diamond = Value("♦")
  val Club = Value("♣")
  val Spade = Value("♠")
}
println(CardsSuits.values)

//7
import CardsSuits._

def isCardSuiteRed(suit: CardsSuits.CardsSuits): Boolean =  suit == CardsSuits.Heart || suit == CardsSuits.Diamond

println(isCardSuiteRed(Heart))
println(isCardSuiteRed(Diamond))
println(isCardSuiteRed(Club))
println(isCardSuiteRed(Spade))
//8
object RGBCubeCorners extends Enumeration {
  val Black = Value(0x000000)
  val Red = Value(0xff0000)
  val Green = Value(0x00ff00)
  val Blue = Value(0x0000ff)
  val Yellow = Value(0xffff00)
  val Cyan = Value(0x00ffff)
  val Magenta = Value(0xff00ff)
  val White = Value(0xffffff)
}
println(for (color <- RGBCubeCorners.values) yield ("0x%06x".format(0xFFFFFF & color.id), color))


