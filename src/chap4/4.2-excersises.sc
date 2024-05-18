sealed trait Shape {
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

case class Rectange( width: Double, height: Double) extends Rectangle

case class Square(side: Double) extends Shape {
  val width = side
  val height = side
}

object Draw() {
  def apply(shape: Shape) =
    shape match{
      case Circle(radius) => s"Circle of radius $radius"
      case Rectange(width, length) => s"Rectangle of width $width, and height $height"
      case Square(side) => s"Square with side length $side"
    }
    
}

sealed trait Color {
  def red: Double
  def blue: Double
  def green: Double

  def isLight = (red + green + blue)/3.0 > 0.5
  def isDark =  !isLight
}

case class Color(r: Double, b: Double, g: Double) extends Color{
  val red = r
  val blue = b
  val green = g
}
