package exercises.chapter8

/**
 * Created by michal on 11/11/14.
 */

object MainE3 extends App {

  class Person(val firstName: String, val lastName: String) {
    override def toString() = firstName + " " + lastName
  }

  object Person {
    def apply(firstName: String, lastName: String) = new Person(firstName, lastName)
  }

  abstract class Vehicle(val name: String, val registrationNumber: String, owner: Person, val color: String, val maxSpeed: Int) {
    var speed: Int = 0
    def _speed(speed: Int) = if (speed < maxSpeed) this.speed = speed else this.speed = maxSpeed
    override def toString = name + ", registrationNumber: " + registrationNumber + ", color: " + color + ", speed: " + speed + "/" + maxSpeed
  }

  trait Fuelable {
    val fuelCapacity: Int
    private var fuel: Int = 0
    def refuel() = fuel = fuelCapacity
    def checkFuel(): Int = fuel
  }

  class Car (name:String, registrationNumber: String, owner: Person, color: String, maxSpeed: Int, val fuelCapacity: Int)
    extends Vehicle (name, registrationNumber, owner, color, maxSpeed) with Fuelable {
    override def toString() = super.toString() + ", fuel: " + checkFuel() + "/" + fuelCapacity
  }
  val car = new Car("Toyota GT86", "WAW-34FFGG", Person("Crazy", "Joe"), "Red", 233, 100)
  car.speed = 100
  car.refuel()
  println(car)
}
