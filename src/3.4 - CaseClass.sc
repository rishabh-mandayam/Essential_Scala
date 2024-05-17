case class Person(firstName: String, lastName: String) {
  def name = firstName + " " + lastName
}

val rishabh = new Person("Rishabh", "Mandayam")

Person

new Person("Noel", "Welsh").equals(new Person(""))