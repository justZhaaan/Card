 val mySberCard = SberCard(500) //сумма на карте
 val myAlphaCard = AlphaCard(1000)
fun main() {
    println(
        "Выберите карту \n" +
                "1 -> сбер банк \n" +
                "2 -> альфа банк\n")

    var n = readLine()?.toIntOrNull() ?: return

    while (n <= 0) {
        println("Выберите 1 или 2")
        n = readLine()?.toIntOrNull() ?: return
    }

    when (n) {
        1 -> {
            println(
                "Такс, вы выбрали карту сбера \n" +
                        "Выберите фунцию: \n" +
                        "1 -> Оплатить \n" +
                        "2 -> Пополнить \n" +
                        "3 -> Информация о карте \n"
            )
            val c = readLine()?.toIntOrNull()
            when (c) {
                1 -> {
                    mySberCard.pay()
                    myMain()
                }

                2 -> {
                    mySberCard.topUp()
                    myMain()
                }

                3 -> {
                    mySberCard.CardInfoSber()
                    myMain()
                }
            }
        }

        2 -> {
            println(
                "Такс, вы выбрали карту Альфа \n" +
                        "Выберите фунцию:  \n" +
                        "1 -> Оплатить \n" +
                        "2 -> Пополнить \n" +
                        "3 -> Информация о карте \n"
            )
            val a = readLine()?.toIntOrNull()
            when (a) {
                1 -> {
                    myAlphaCard.pay()
                    myMain()
                }
                2 -> {
                    myAlphaCard.topUp()
                    myMain()
                }
                3 -> {
                    myAlphaCard.CardInfoAlpha()
                    myMain()
                }
            }
        }
    }
}

fun myMain() {
    println("Ну теперь снова выбирай нужную карту ¯\\_(ツ)_/¯ ")
    main() }
