trait Feline {
  name: String
  color: String
  sound: String
}

case class Cat(
  name: String,
  color: String,
  food: String
) extends Feline {
  val sound = "meow"
}

case class Lion(
  name: String,
  color: String,
  maneSize: Int
) extends Feline {
  val sound = "roar"
}

case class Tiger(
  name: String,
  color: String,
) extends Feline {
  val sound = "roar"
}

case class Panther(
  name: String,
  color: String,
) extends Feline {
  val sound = "roar"
}

trait Shape {
  def sides: Int
  def perimeter: Int
  def area: Int
}
case class Circle(radius: Double) extends Shape{
  val sides = 1;
  val perimeter = 2 * math.Pi * radius
  val area = math.Pi * radius * radius
}

trait Rectangle extends Shape {
  def width: Double
  def height: Double
  val sides = 4
  override val perimeter = 2 * (width + height)
  override val area = width * height
}

case class Rectange(length: Double, width: Double) extends Rectangle

case class Square(side: Double) extends Shape {
  val width = side
  val height = side
}
