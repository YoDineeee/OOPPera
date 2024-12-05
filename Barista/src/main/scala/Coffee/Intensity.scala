package Coffee

// Enum for coffee intensity levels
sealed trait Intensity
object Intensity {
  case object Light extends Intensity
  case object Normal extends Intensity
  case object Strong extends Intensity
}
