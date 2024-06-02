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
//option 1: Polymorphism
sealed trait Feline {
  def dinner: Food
}
final case class Lion() extends Feline {
  def dinner: Food = Antelope
}
final case class Tiger() extends Feline {
  def dinner: Food = TigerFood
}
final case class Panther() extends Feline {
  def dinner: Food = Licorice
}
final case class Cat(favoriteFood: String) extends Feline {
  def dinner: Food = CatFood(favoriteFood)
}

sealed trait Food
case object Antelope extends Food
case object TigerFood extends Food
case object Licorice extends Food
final case class CatFood(food: String) extends Food

//option 2: Using pattern matching
sealed trait Feline {
  def dinner: Food =
    this match {
      case Lion() => Antelope
      case Tiger() => TigerFood
      case Panther() => Licorice
      case Cat(favoriteFood) => CatFood(favoriteFood)
    }
}
