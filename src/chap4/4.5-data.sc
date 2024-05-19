//sum pattern
sealed trait A {
  def foo: String
}

final case class B() extends A {
  def foo:String = "It's B"
}

final case class C() extends A {
  def foo: String = "It's C"
}

val anA: A = B()
anA.foo


val anA: A = C()
anA.foo

sealed trait Feline
final case class Lion() extends Feline
final case class Tiger() extends Feline
final case class Panther() extends Feline
final case class Cat(favoriteFood: String) extends Feline

sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
final case class CatFood(food: String) extends Food
