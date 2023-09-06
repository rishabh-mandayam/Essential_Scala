object TestObject {
  val person = "Rishabh"

  val simpleField: Unit = {
    println("Evalutating simple field")
    42
  }

  def noParameterMethod(): Int = {
    println("Evaluating no parameter method")
    42
  }

  def name: String = "Probably the best object ever"

  def hello(name: String): String =
    "Hello" + name



}
