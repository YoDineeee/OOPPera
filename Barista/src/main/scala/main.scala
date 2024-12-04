import Barista.Barista
import java.util.Arrays

object main {
 def main(args: Array[String]): Unit = {
  val barista = new Barista()
  barista.makeCoffees(Arrays.asList("Cappuccino", "SyrupCappuccino", "PumpkinSpiceLatte"))
 }
}



