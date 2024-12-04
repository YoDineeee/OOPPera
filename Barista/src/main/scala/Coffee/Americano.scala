package Coffee

class Americano (intensity: Intensity, var mlOfWater: Int) extends Coffee(intensity){

  val coffeeName = "Americano"

  def getMlOfWater: Int = mlOfWater

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName water: $mlOfWater ml")
  }

  def makeAmericano(): Unit = {
    println("Making Americano")
    println(s"Intensity set to $coffeeIntensity")
    println(s"Adding $mlOfWater ml of water")
  }

}
