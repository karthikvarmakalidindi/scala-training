package Roadmap

object Vechicle extends App {

  class Vehicle(make: String, model: String) {
    def displayInfo1(): Unit = {
      println(s"Vehicle: $make $model")
    }
  }

  case class Car(make: String, model: String, color: String) extends Vehicle(make, model) {
    def displayInfo (): Unit = {
      println(s"Car: $make $model, Color: $color")
    }
  }

  case class Motorcycle(make: String, model: String) extends Vehicle(make, model) {
    def displayInfo (): Unit = {
      println(s"Motorcycle: $make $model")
    }
  }

  case object VehicleCategory {
    val carcategories = Seq("Sedan", "SUV")
  }

      val car = Car("Toyota", "Camry", "Blue")
      val motorcycle = Motorcycle("Harley Davidson", "Sportster")

      car.displayInfo()
      motorcycle.displayInfo1()

      println(s"Vehicle Categories: ${VehicleCategory.carcategories.mkString(" ")}")
  println(s"Vehicle Categories: ${motorcycle}")

}

