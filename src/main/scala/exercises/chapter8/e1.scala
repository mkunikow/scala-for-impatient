package exercises.chapter8

/**
 * Created by michal on 11/11/14.
 */

object MainE1 extends App {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class CheckingAccount(initialBalance: Double, commission: Double = 1.0) extends BankAccount(initialBalance) {
    override def deposit(amount: Double) = super.deposit(amount - commission)
    override  def withdraw(amount: Double) = super.withdraw(amount + commission)
  }
  val checkingAccount = new CheckingAccount(100)
  println(checkingAccount.deposit(100))
  println(checkingAccount.withdraw(10))
}
