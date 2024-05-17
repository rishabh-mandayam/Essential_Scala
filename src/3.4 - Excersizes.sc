case class Cat(color: String, food: String)



case class Timer(count: Int  = 0) {
  def dec = copy(count = count - 1)
  def inc = copy(count = count + 1)
}

val timer  = new Timer(10)

timer.dec
timer.inc

case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

object Person {
  def apply(name: String): Person = {
    val parts = name.split(" ")
    apply(parts(0), parts(1))
  }
}