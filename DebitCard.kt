open class DebitCard(funds: Int) : BankCard(funds) {
    var n = Int

    override fun topUp(){ //пополнить

        println("Bведите сумму для пополнения:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("Сумма равно нулю, ничего не добавлено")
        else funds += n
    }


    override fun pay(){//оплатить
        println("Bведите сумму для оплаты:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("По сути ничего не оплачено")
        else funds+=n
        println("после оплаты на сумму $n" +
                "")
    }

    fun cardInfo(){
        val num = (1..9).random()
        println("номер карты ${num} \n" +
                "cvv  \n" +
                "годен до ")
        println("Всего средств $funds ")

    }


}