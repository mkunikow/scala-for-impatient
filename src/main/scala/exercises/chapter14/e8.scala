package exercises.chapter14

/**
 * Created by michal on 12/10/14.
 */
object e8 extends App {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(op: String, nodes: BinaryTree*) extends BinaryTree

  def eval(root: BinaryTree): Int = root match {
    case Leaf(v) => v
    case Node(op, n @ _*) => op match {
      case "+" => n.map(eval).sum
      case "-" => -n.map(eval).sum
      case "*" => n.map(eval).product
    }
  }

}
