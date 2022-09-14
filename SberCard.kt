import kotlin.random.Random

class SberCard(funds: Int) : CreditCard(funds) {
    var bonusSberCard = 1
    override fun pay() { //оплатить
        println("Bведите сумму для оплаты:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("По сути ничего не оплачено")
        else funds-=n
        this.bonusSberCard = (funds * 0.15).toInt() //типо кэшбек 15% от покупки
        println("После оплаты на сумму $n \n" +
                "Общий баланс $funds \n" +
                "Всего бонусов от покупок $bonusSberCard \n")
    }


    override fun topUp(){ //пополнить

        println("Bведите сумму для пополнения:")
        val n = readLine()?.toIntOrNull()
        if (n == null) println("Сумма равно нулю, ничего не добавлено")
        else funds += n
        println("После пополнения на сумму $n \n" +
                "Общий баланс $funds \n" +
                "Всего бонусов  $bonusSberCard \n" )
    }

    fun CardInfoSber(){
        val numCard = Random.nextInt(10000000,999999999)
        val cvv = Random.nextInt(100,999)
        val monthBefore = Random.nextInt(1,30)
        val yearBefore = Random.nextInt(22, 29)

        println("номер карты ${numCard} \n" +
                "cvv $cvv \n" +
                "срок действия $monthBefore /$yearBefore \n")
    }



}