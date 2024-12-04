package Barista

import Coffee._

class Barista {
  def makeCoffees(coffeeOrders: List[String]): Unit = {
    coffeeOrders.foreach { order =>
      val coffee = order match {
        case "Americano" =>
          Some(Americano(Intensity.Normal, 100))
        case "Cappuccino" =>
          Some(new Cappuccino(Intensity.Normal, 50, 100))
        case "PumpkinSpiceLatte" =>
          Some(PumpkinSpiceLatte(Intensity.Strong, 50, 100, SyrupType.Vanilla, 50))
        case "SyrupCappuccino" =>
          Some(SyrupCappuccino(Intensity.Light, 50, 100, SyrupType.Caramel))
        case unknown =>
          println(s"Unknown coffee type: $unknown")
          None
      }

      coffee.foreach {
        case a: Americano => a.makeAmericano()
        case c: Cappuccino => c.makeCappuccino()
        case p: PumpkinSpiceLatte => p.makePumpkinSpiceLatte()
        case s: SyrupCappuccino =>
          s.printCoffeeDetails()
          s.makeSyrupCappuccino()
        case _ =>
      }
    }
  }
}
