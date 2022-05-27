//for (i in 1..5) {
//    val accountOwner: String = "Daniel $i"
//    val accountNumber: Int = 1000 + i
//    var accountBalance: Double = 0.0 + i
//
//    accountBalance += 100
//
//
//}

val account01 = Account()
val account02 = Account()

account01.accountOwner = "Daniel"
account01.accountNumber = 1000
account01.accountBalance = 100.0

account02.accountOwner = "Alice"
account02.accountNumber = 1001
account02.accountBalance = 500.0

println(account01.accountOwner)
println(account01.accountNumber)
println(account01.accountBalance)

println(account02.accountOwner)
println(account02.accountNumber)
println(account02.accountBalance)

account01.Deposit(10.0)
println(account01.accountBalance)

account02.Transfer(10.0, account01)

class Account(){
    var accountOwner: String = ""
    var accountNumber: Int = 0
    var accountBalance: Double = 0.0


    fun Deposit(value: Double){
        this.accountBalance += value
        println("$value dolars has been deposited into your account!")
    }

    fun Withdraw(value: Double){
        if (this.accountBalance >= value){
            this.accountBalance -= value
            println("$value has been withdrawn from your account!")
        }
        else{
            println("You don't have enough funds!")
        }
    }

    fun Transfer(value: Double, reciever: Account): Boolean{
        if(this.accountBalance >= value){
            this.Withdraw(value)
            reciever.Deposit(value)
            println("$value has been transfered to ${reciever.accountOwner}!")
            return true
        }
        else if(this.accountBalance < value){
            println("Not enough funds!")
            return false
        }

        println("There's no such account ID")
        return false
    }
}

fun checkBalance(accountBalance: Double) {
    if (accountBalance > 0) {
        println("Your account balance is postive!")
    } else if (accountBalance == 0.0) {
        println("Your account balance is empty!")
    } else {
        println("Your account balance is negative!")
    }
}