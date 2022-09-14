open class CreditCard(funds: Int) :BankCard(funds){
   open val creditCardLimit  = 10000
   open var creditFacilities = 10000//кредитные средства

   override fun topUp(){ //пополнить

      println("Bведите сумму для пополнения:")
      val n = readLine()?.toIntOrNull()
      while ( creditFacilities < 10000){
         if (n != null) {
            creditFacilities += n
            println("после пополнения на сумму $n" +
                    "Кредитные средства $creditFacilities" +
                    "Общие средства $funds")
         } else println("Сумма равно нулю, ничего не добавлено" ) }
      if (n != null) {
         funds += n
         println("после пополнения на сумму $n" +
                 "Кредитные средства $creditFacilities" +
                 "Общие средства $funds")
      } else println("Сумма равно нулю, ничего не добавлено")
   }


   override fun pay(){//оплатить
      println("Bведите сумму для оплаты:")
      val n = readLine()?.toIntOrNull()
      while ( funds > 0){
         if (n == 0) println("По сути ничего не оплачено")
         else if (n != null) {
            if (n > creditCardLimit)  println("Сумма превышает кредитный лимит, купите подешевле -_-")
         else funds -= n
            println("После оплаты на сумму $n" +
                         "Общие средства $funds" +
                         "Кредитные средства $creditFacilities")

   }

   fun cardInfo(){}

      }
   }
}



//println("Введите сумму для оплаты: ")
//var n = readLine()?.toIntOrNull()
//while (creditFacilities < 10000 ){
//    if (n != null) {
//        creditFacilities += n
//    }
//    else  println("Сумма равна нулю, ведите заново \n")
//}
//if (n != null) {
//    ownFunds += n
//}
//else  println("Сумма равна нулю, ведите заново \n")
//}
