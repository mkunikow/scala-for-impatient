package exercises.chapter14

/**
 * Created by michal on 12/10/14.
 */
object e6 extends App {

  sealed abstract class BinaryTree
  case class Leaf(value: Int) extends BinaryTree
  case class Node(left: BinaryTree, right: BinaryTree) extends BinaryTree

  def leafSum(root: BinaryTree): Int = root match {
    case Leaf(v) => v
    case Node(l, r) => leafSum(l) + leafSum(r)
  }

}
