class Person(val firstName: String, val lastName: String) {
  def name(): String = {
    s"$firstName lastName"
  }
}

object Person {
  def apply(name: String): Person  = {
    val splitName = name.split(" ")
    new Person(splitName(0), splitName(1))
  }
}

Person.apply("John Doe").firstName

Person("Rishabh Mandayam").lastName

class Director(f: String, l: String, year: Int) {
  val firstName = f
  val lastName = l
  val yearOfBirth = year

  def name(): String = {
    firstName + " " + lastName
  }
  
  def copy(f: String = this.firstName,
           l: String = this.lastName,
           year: Int = this.yearOfBirth): Director = {
    new Director(f, l, year)
	} 
}

object Director {
  def apply(f: String, l: String, year: Int): Director =  {
    new Director(f, l, year)
  }

  def older(directorOne: Director, directorTwo: Director): Director = {
   if (directorOne.yearOfBirth > directorTwo.yearOfBirth) directorOne else directorTwo
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
  
  def copy(n: String = this.name, 
	   year: Int = this.yearOfRelease, 
	   imdb: Double = this.imdbRating,
	   direct: Director = this.director): Film =  {
    new Film(n, year, imdb, direct)
  }
}

object Film {
  def apply(n: String, year: Int, imdb: Double, director: Director): Film = {
    new Film(n, year, imdb, director)
  }

  def highestRating(filmOne: Film, filmTwo: Film): Film = {
    if (filmOne.imdbRating > filmTwo.imdbRating) filmOne else filmTwo
  }
}