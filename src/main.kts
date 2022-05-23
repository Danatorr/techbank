for (i in 1..5) {
    val accountOwner: String = "Daniel $i"
    val accountNumber: Int = 1000 + i
    var accountBalance: Double = 0.0 + i

    accountBalance += 100

    println("Welcome to TechBank $accountOwner!\nYour account number is $accountNumber\nYour account balance is: $accountBalance")
    checkBalance(accountBalance)
    //This is similar to switch case and replaces the code below it
    //when {
    //    accountBalance > 0 -> {
    //        println("Your account balance is postive!")
    //    }
    //    accountBalance == 0 -> {
    //        println("Your account balance is empty!")
    //    }
    //    else -> {
    //        println("Your account balance is negative!")
    //    }
//}
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