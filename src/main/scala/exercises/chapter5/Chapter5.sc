import scala.beans.BeanProperty

//1
class Counter {
  private var value = 0 // You must initialize the field
  def increment() { if (value != Int.MaxValue )value += 1 }
  def current() = value
}
val myCounter = new Counter // Or new Counter()

myCounter.increment()
println(myCounter.current)
//2
class BankAccount {
   private var privBalance = 0
   def balance = privBalance
   def deposit(deposit:Int) {privBalance += deposit}
   def withdraw(amount: Int) {if (amount <= privBalance) privBalance -= amount else privBalance = 0}
}

val bankccount = new BankAccount();
bankccount.deposit(20)
println(bankccount.balance)
bankccount.withdraw(10)
println(bankccount.balance)
bankccount.withdraw(100)
println(bankccount.balance)
//3
  class Time(val hours: Int, val minutes: Int) {
    private def convertToMin = hours * 60 + minutes
    def before(other: Time): Boolean = convertToMin < other.convertToMin
  }

  println(new Time(14, 30).before(new Time(15, 0)))

//4

  class Time2(val hours: Int, val minutes: Int) {
    private val minSinceMidnight = hours * 60 + minutes
    def before(other: Time2): Boolean = minSinceMidnight < other.minSinceMidnight
  }
  println(new Time2(14, 30).before(new Time2(15, 0)))

//5

class Student(@BeanProperty var id: Int, @BeanProperty var name: String)

var student = new Student(1, "Student1")
student.setName("Student1Updated")
student.getName
student.id = 2
student.id
//6
class Person(ageInput: Int) {
  var age = if (ageInput > 0) ageInput else 0
}
val person = new Person(-1)
person.age
//7
class Person2(firstNameLastName:String) {
  val Array(firstName, lastName) = firstNameLastName.split(" ")
}
val person2 = new Person2("FirstName LastName")
person2.firstName
person2.lastName
//8
class Car(val manufacturer:String, val model:String, val year:Int = -1 , var plate:String="" ) {
  override def toString() = {
    "Manufacturer: " + manufacturer + " Model: " + model + " Year: " + year + " Plate: " + plate
  }
}
new Car("Ford", "Mustang")
new Car("Ford", "Mustang", 2000)
new Car("Ford", "Mustang", plate = "YYY")
new Car("Ford", "Mustang", 2000, "ABC")

//9 Java sucks,  not implemented :)

//10
class Employee(val name: String, var salary: Double) {
  def this() { this("John Q. Public", 0.0) }
}

class Employee2(nameInput: String = "John Q. Public", salaryInput: Double = 0.0) {
  val name = nameInput
  val salary = salaryInput
}

new Employee2()
new Employee2(nameInput = "Name1")
new Employee2(salaryInput = 10)
new Employee2("Name2", 20)

