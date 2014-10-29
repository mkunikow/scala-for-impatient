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

