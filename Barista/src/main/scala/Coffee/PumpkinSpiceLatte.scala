package Coffee

class PumpkinSpiceLatte extends SyrupCappuccino (
                         intensity: Intensity,
                         mlOfWater: Int,
                         mlOfMilk: Int,
                         syrup: SyrupType,
                         var mgOfPumpkinSpice: Int
                       ) extends Coffee(intensity, mlOfWater, mlOfMilk, syrup) {

  val coffeeName = "Pumpkin Spice Latte"

  def getMgOfPumpkinSpice: Int = mgOfPumpkinSpice

  def getName: String = coffeeName

  @Override

  def printCoffeeDetails(): Unit = {
    println(s"$coffeeName water: ${getMlOfWater} ml, milk: ${getMlOfMilk} ml, syrup: ${getSyrup}, pumpkin spice: $mgOfPumpkinSpice mg")
  }

  @Override
   def makeRecipe(): Unit = {
    super.makeRecipe()
    println(s"Adding $mgOfPumpkinSpice mg of pumpkin spice")
  }

  def makePumpkinSpiceLatte: PumpkinSpiceLatte = {
    println(s"Making $coffeeName")
    this.makeRecipe()
    this
  }
}
