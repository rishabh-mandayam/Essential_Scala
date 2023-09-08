class Cat(Name: String, Colour: String, Food: String) {
  val name = Name
  val colour = Colour
  val food = Food
}

val Oswald = new Cat("Oswald", "Black", "Milk")

val Henderson = new Cat("Henderson", "Ginger", "Chips")

val Quentin = new Cat("Quentin", "Tabby and white", "Curry")


object ChipShop {
  def willServe(c: Cat): Boolean = {
    c.food.equals("Chips")
  }
}

class Director(f: String, l: String, year: Int) {
  val firstName = f
  val lastName = l
  val yearOfBirth = year

  def name(): String = {
    firstName + " " + lastName
  }
}

class Film(n: String, year: Int, imdb: Double, direct: Director) {
  val name = n
  val yearOfRelease = year
  val imdbRating = imdb
  val director = direct

  def directorsAge(): Int = {
    yearOfRelease - director.yearOfBirth
  }

  def isDirectedBy(inputDirector: Director): Boolean =  {
    director.name().equals(inputDirector.name())
  }
}

val eastwood = new Director("Clint", "Eastwood", 1930)
val mcTiernan = new Director("John", "McTiernan", 1951)
val nolan = new Director("Christopher", "Nolan", 1970)
val someBody = new Director("Just", "Some Body", 1990)
val memento = new Film("Memento", 2000, 8.5, nolan)
val darkKnight = new Film("Dark Knight", 2008, 9.0, nolan)
val inception = new Film("Inception", 2010, 8.8, nolan)
val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7,
  eastwood)
val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9,
  eastwood)
val unforgiven = new Film("Unforgiven", 1992, 8.3, eastwood)
val granTorino = new Film("Gran Torino", 2008, 8.2, eastwood)
val invictus = new Film("Invictus", 2009, 7.4, eastwood)
val predator = new Film("Predator", 1987, 7.9, mcTiernan)
val dieHard = new Film("Die Hard", 1988, 8.3, mcTiernan)
val huntForRedOctober = new Film("The Hunt for Red October", 1990,
  7.6, mcTiernan)
val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8,
  mcTiernan)