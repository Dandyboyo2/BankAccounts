class CurrentAccount(balance: Double, accountName: String) extends BankAccount {

  override def withdraw(amount: Double): CurrentAccount = {
    new CurrentAccount(balance - amount,accountName)
  }

  override def deposit(amount: Double): BankAccount = {
    new  CurrentAccount(balance + amount, accountName)
  }

  override def checkBalance(): Double = {
    balance
  }
}
