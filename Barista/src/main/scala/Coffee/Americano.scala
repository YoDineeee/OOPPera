package Coffee

case class Americano(coffeeIntensity: Intensity, mlOfWater: Int) extends Coffee(coffeeIntensity) {
  val coffeeName: String = "Americano"

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName - Intensity: $coffeeIntensity, Water: $mlOfWater ml")
  }

  def makeAmericano(): Americano = {
    println(s"Making $coffeeName...")
    println(s"Adding $mlOfWater ml of water")
    this
  }
}
