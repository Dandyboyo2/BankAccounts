class paypal(balance : Double, accountName : String) extends BankAccount{
  override def withdraw(amount: Double): BankAccount = {
    new paypal(balance - (amount + (amount * 0.05)), accountName)
  }

  override def deposit(amount: Double): BankAccount = {
    new paypal(balance + amount, accountName)
  }

  override def checkBalance(): Double = {
    balance
  }
}