class Adder(ammount: Int) {
  def apply(in: Int): Int = in + ammount
}

val add3 = new Adder(3)

add3.apply(2)

add3(4)
