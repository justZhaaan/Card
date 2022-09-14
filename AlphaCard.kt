import kotlin.random.Random

class AlphaCard(funds: Int) :BankCard(funds) {
    var bonusAlphaCard = 0
    override fun pay() {
        println("Bведите сумму для оплаты:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("По сути ничего не оплачено")
        else funds-=n
        println("после оплаты на сумму $n" +
                "Общий баланс $funds" )

    }

    override fun topUp(){

        //пополнить
        println("Bведите сумму для пополнения:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("Сумма равно нулю, ничего не добавлено")
        else funds += n
        if (n != null) {
            if (n>5000) this.bonusAlphaCard = (funds * 1.08).toInt() //при пополнении больше 5000р, капают процентики
        }
        println("после пополнения на сумму $n \n" +
                "Общий баланс $funds \n" +
                "Всего бонусов ${this.bonusAlphaCard} \n")

    }

    fun CardInfoAlpha(){
        val numCard = Random.nextInt(10000000,999999999)
        val cvv = Random.nextInt(100,999)
        val monthBefore = Random.nextInt(1,30)
        val yearBefore = Random.nextInt(22, 29)

        println("номер карты ${numCard} \n" +
                "cvv $cvv \n" +
                "срок действия $monthBefore /$yearBefore \n")
    }


}