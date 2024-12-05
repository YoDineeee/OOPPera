package Coffee

// Enum for different syrup types
sealed trait SyrupType
object SyrupType {
  case object Vanilla extends SyrupType
  case object Caramel extends SyrupType
  case object Chocolate extends SyrupType
  case object Macadamia extends SyrupType
}
