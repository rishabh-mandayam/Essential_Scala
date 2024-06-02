sealed trait Expression {
  def eval: Double =
    this match {
      case Number(value) => value
      case Addition(left, right) => left.eval + right.eval
      case Subtraction(left, right) => left.eval - right.eval
      case Division
    }
}
final case class Addition(left: Expression, right: Expression) extends Expression
final case class Subtraction(left: Expression, right: Expression) extends Expression
final case class Division(left: Expression, right: Expression) extends Expression
final case class SquareRoot(left: Expression, right: Expression) extends Expression
final case class Number(value: Double) extends Expression



