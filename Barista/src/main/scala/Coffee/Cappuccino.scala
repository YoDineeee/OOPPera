package Coffee

class Cappuccino extends Coffee(intensity, mlOfWater){
  val coffeeName = "Cappuccino"

  def getMlOfMilk: Int = mlOfMilk

  def getCoffee: String = coffeeName


  @Override

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName water: ${getMlOfWater} ml, milk: $mlOfMilk ml")
  }

  // base method
  def makeRecipe(): Unit = {
    println(s"Intensity set to $coffeeIntensity")
    println(s"Adding $mlOfMilk ml of milk")
  }

  // specialized method
  def makeCappuccino: Cappuccino = {
    println(s"Making $coffeeName")
    this.makeRecipe()
    this
  }

}
