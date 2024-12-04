package Coffee

class Cappuccino(coffeeIntensity: Intensity, val mlOfMilk: Int, val mlOfWater: Int) extends Coffee(coffeeIntensity) {
  val coffeeName: String = "Cappuccino"

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName - Intensity: $coffeeIntensity, Milk: $mlOfMilk ml, Water: $mlOfWater ml")
  }

  def makeCappuccino(): Cappuccino = {
    println(s"Making $coffeeName...")
    println(s"Adding $mlOfMilk ml of milk and $mlOfWater ml of water")
    this
  }
}
