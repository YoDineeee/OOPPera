package Coffee

case class SyrupCappuccino(coffeeIntensity: Intensity, mlOfMilk: Int, mlOfWater: Int, syrupType: SyrupType) extends Coffee(coffeeIntensity) {
  val coffeeName: String = "Syrup Cappuccino"

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName - Intensity: $coffeeIntensity, Milk: $mlOfMilk ml, Water: $mlOfWater ml, Syrup: $syrupType")
  }

  def makeSyrupCappuccino(): SyrupCappuccino = {
    println(s"Making $coffeeName...")
    println(s"Adding $mlOfMilk ml of milk, $mlOfWater ml of water, and $syrupType syrup")
    this
  }
}

object SyrupCappuccino {
  def unapply(cappuccino: SyrupCappuccino): Option[(Intensity, Int, Int, SyrupType)] = {
    Some((cappuccino.coffeeIntensity, cappuccino.mlOfMilk, cappuccino.mlOfWater, cappuccino.syrupType))
  }
}
