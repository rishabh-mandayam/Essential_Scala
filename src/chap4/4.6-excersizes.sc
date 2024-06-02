import scala.annotation.tailrec

sealed trait IntList
case object End extends IntList //base case for recursion
final case class Pair(head: Int, tail: IntList) extends IntList

@tailrec
def length(list: IntList, total: Int = 0): Int =
  list match {
    case End => 0
    case Pair(hd, tl) => length(tl, total + 1)
  }

@tailrec
def product(list: IntList, total: Int = 1): Int =
  list match {
    case End => 1
    case Pair(hd, tl) => length(tl, total * hd)
  }

def double(list: IntList): IntList =
  list match {
    case End => End
    case Pair(hd, tl) => Pair(hd * 2, double(tl))
  }

//forest of trees
sealed trait Tree
case object Leaf(value: Int) extends Tree //base case for recursion
final case class Node(left: Tree, right: Tree) extends Tree

def sumTree(tree: Tree): Int =
  tree match {
    case Leaf(value) => value
    case Node(left, right) => sumTree(left) + sumTree(right)
  }

def doubleTree(tree: Tree): Tree =
  list match {
    case Leaf(value) => Leaf(value * 2)
    case Node(left, right) => Node(doubleTree(left), doubleTree(right))
  }