package Coffee

class Coffee (val coffeeIntensity: Intensity){
  val coffeeName: String = "Coffee"

  def getCoffeeIntensity: Intensity = coffeeIntensity

  def getName: String = coffeeName

  def printCoffeeDetails(): Unit = {
    println(s"Coffee intensity: $coffeeIntensity")
  }
}
