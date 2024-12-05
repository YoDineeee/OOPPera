package Coffee

case class PumpkinSpiceLatte(
                              coffeeIntensity: Intensity,
                              mlOfMilk: Int,
                              mlOfWater: Int,
                              syrupType: SyrupType,
                              syrupAmount: Int
                            ) extends Coffee(coffeeIntensity) {
  val coffeeName: String = "Pumpkin Spice Latte"
@Override
  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName - Intensity: $Intensity, Milk: $mlOfMilk ml, Water: $mlOfWater ml, Syrup: $syrupType, Pumpkin Spice: $syrupAmount mg")
  }

  def makePumpkinSpiceLatte(): PumpkinSpiceLatte = {
    println(s"Making $coffeeName...")
    println(s"Adding $mlOfMilk ml of milk, $mlOfWater ml of water, and $syrupType syrup")
    this
  }
}
