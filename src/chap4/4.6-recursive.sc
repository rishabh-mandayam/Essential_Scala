import scala.annotation.tailrec

sealed trait IntList
case object End extends IntList //base case for recursion
final case class Pair(head: Int, tail: IntList) extends IntList

Pair(1, Pair(2, Pair(3, End))

//another way to represent this list is like this:
val d = End()
val c = Pair(3, End)
val b = Pair(2, c)
val a = Pair(1, b)

//Recursive Funtion time
val example = Pair(1, Pair(2, Pair(3, End))
assert(sum(example) == 6)
assert(sum(example.tail) == 5)
assert(sum(End) == 0)

def sum(list: IntList): Int =
  list match {
    case End => 0
    case Pair(hd, tl) => hd + sum(tl)
  }

/* This is great an all but consumes excessive stack space, so instead
we can implement tail recursion optimization
*/
@tailrec
def sum(list: IntList, total: Int = 0): Int =
  list match {
    case End => 0
    case Pair(hd, tl) => sum(tl, total + hd)
  }

