package exercises.Chapter8

/**
 * Created by michal on 11/11/14.
 */
abstract class Item {
  def price: Double
  def description: String
  override def toString = "Item: " + description + ", price: " + price
}

class SimpleItem(val price: Double, val description: String) extends Item

object SimpleItem {
  def apply(price: Double, description: String) = new SimpleItem(price, description)
}

class Bundle(val description: String) {
  private var items: List[Item] = List()
  def addItem(item: Item) = items = item :: items
  def price: Double = items.map(_.price).sum
  override def toString = "Bundle: " + description + ", price: " + price + ", items: " + items
}

object maine4 extends App {
 val bundle = new Bundle("Bundle")
  bundle.addItem(SimpleItem(2.0, "item1"))
  bundle.addItem(SimpleItem(3.0, "item2"))
 println(bundle)
}
