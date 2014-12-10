package exercises.chapter14

/**
 * Created by michal on 12/9/14.
 */
object e4 extends App {

  abstract class Item
  case class Article(name: String, price: Double) extends Item
  case class Multiple(multiplier: Int, items: Item*) extends Item

  def price(it: Item): Double = it match {
    case Article(_, p) => p
    case Multiple(m,  its @ _*) => m * its.map(price _).sum
  }
}
