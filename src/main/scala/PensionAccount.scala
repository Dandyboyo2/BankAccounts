class PensionAccount(balance: Double, accountName: String) extends BankAccount {
  override def withdraw(amount: Double): BankAccount = {
    throw new UnsupportedOperationException
  }

  override def deposit(amount: Double): BankAccount = {
    new PensionAccount(balance + amount, accountName)

  }

  override def checkBalance(): Double ={
    balance

  }
}
