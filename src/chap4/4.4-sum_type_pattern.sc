//this is excersises

sealed trait trafficLight

case object Red extends trafficLight
case object Yellow extends trafficLight
case object Green extends trafficLight

sealed trait Calculation
case class success(result: Int) extends Calculation
case class failure(result: Int) extends Calculation

sealed trait Source
case object Well extends Source
case object Spring extends Source
case object Tap extends Source


