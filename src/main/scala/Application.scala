object Application extends App {

  val barclays = new CurrentAccount(500, "barclays")
  val lloyds = new CurrentAccount(800, "lloyds")
  val hsbc = new paypal(1000, "hsbc")
  val lloydsPension = new PensionAccount(1000, "lloydsPension")

  println(barclays.withdraw(20).checkBalance())
  println(lloyds.withdraw(50).checkBalance())
  println(hsbc.withdraw(100).withdraw(100).checkBalance())
  println(lloydsPension.withdraw(100))



}
