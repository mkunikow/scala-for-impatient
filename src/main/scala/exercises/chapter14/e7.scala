package exercises.chapter14

/**
 * Created by michal on 12/10/14.
 */
object e7 extends App {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(nodes: BinaryTree*) extends BinaryTree

  def leafSum(root: BinaryTree): Int = root match {
    case Leaf(v) => v
    case Node(n @ _*) => n.map(leafSum).sum
  }

}
