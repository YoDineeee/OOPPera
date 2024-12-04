package Coffee

class SyrupCappuccino extends Cappuccino {
  class SyrupCappuccino(
                         intensity: Intensity,
                         mlOfWater: Int,
                         mlOfMilk: Int,
                         var syrup: SyrupType
                       ) extends Cappuccino(intensity, mlOfWater, mlOfMilk) {

    val coffeeName = "Syrup Cappuccino"

    def getSyrup: SyrupType = syrup

    def getCoffee: String = coffeeName

    @Override

    def printCoffeeDetails(): Unit = {
      println(s"$coffeeName water: ${getMlOfWater} ml, milk: ${getMlOfMilk} ml, syrup: $syrup")
    }

    @Override

    def makeRecipe(): Unit = {
      super.makeRecipe()
      println(s"Adding syrup: $syrup")
    }

    def makeSyrupCappuccino: SyrupCappuccino = {
      println(s"Making $coffeeName")
      this.makeRecipe()
      this
    }
  }


}
