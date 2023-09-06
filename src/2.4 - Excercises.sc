object Oswald {
  val name = "Oswald"
  val Colour = "Black"
  var Food = "Milk"
}

object Henderson {
  val name = "Henderson"
  val Colour = "Ginger"
  var Food = "Chips"
}

object Quentin {
  val name = "Quentin"
  val Colour = "Tabby and white "
  var Food = "Curry"
}

object calc {
  def square(input: Double): Double = {
    input * input
  }

  def cube(input: Double): Double = {
    input * square(input)
  }
}

object calc2 {
  def square(input: Double): Double = {
    input * input
  }

  def cube(input: Double): Double = {
    input * square(input)
  }

  def square(input: Int): Int = {
    input * input
  }

  def cube(input: Int): Int = {
    input * square(input)
  }
}

object argh {
  def a: Int = {
    println("a")
    1
  }

  val b = {
    println("b")
    a + 2
  }

  def c: String = {
    println("c")
    a
    b + "c"
  }
}

argh.c + argh.b + argh.a


