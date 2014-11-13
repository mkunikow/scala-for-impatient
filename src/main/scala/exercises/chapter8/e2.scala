package exercises.chapter8

/**
 * Created by michal on 11/11/14.
 */

object MainE2 extends App {

  class BankAccount(initialBalance: Double) {
    private var balance = initialBalance
    def currentBalance = balance
    def deposit(amount: Double) = { balance += amount; balance }
    def withdraw(amount: Double) = { balance -= amount; balance }
  }

  class SavingsAccount(initialBalance: Double,
                       commission: Double = 1.0,
                       freeTransactions: Int = 3,
                       interestRateYear: Double = 0.10
                        ) extends BankAccount(initialBalance) {
    private var transactionCount: Int = 0

    private def currentCommission: Double = if (transactionCount < freeTransactions) 0 else commission

    def earnMonthlyInterest(): Double = {
      transactionCount = 0
      super.deposit(currentBalance * interestRateYear / 12)
    }

    override def deposit(amount: Double) = {
      val result = super.deposit(amount - currentCommission)
      transactionCount += 1
      result
    }

    override def withdraw(amount: Double) = {
      val result = super.withdraw(amount + currentCommission)
      transactionCount += 1
      result
    }
  }


  val checkingAccount = new SavingsAccount(100)
  println(checkingAccount.deposit(100))
  println(checkingAccount.deposit(100))
  println(checkingAccount.deposit(100))
  println(checkingAccount.deposit(100))
  println(checkingAccount.earnMonthlyInterest())
  println(checkingAccount.deposit(100))
}
