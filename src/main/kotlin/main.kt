fun main(args: Array<String>) {
    val arrayForChange = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    for (i in arrayForChange.indices){
        if (arrayForChange[i] % 2 == 0) arrayForChange[i] = 0
        println(arrayForChange[i])
    }

    var sign: String
    var str: String

    do {
        println("Введите символ: ")
        sign = readLine().toString()
    } while (sign.length != 1)

    do {
        println("Введите строку: ")
        str = readLine().toString()
    } while (str.length < 2)

    if (str.indexOf(sign) > -1) println("Позиция символа в строке: " + str.indexOf(sign)) else println("Символ в строке не найден!")

    val matx = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))

    val dtm =
        matx[0][0] * matx[1][1] * matx[2][2] +
        matx[0][2] * matx[0][1] * matx[1][2] +
        matx[0][1] * matx[1][1] * matx[0][2] +
        matx[0][2] * matx[1][1] * matx[0][2] +
        matx[0][0] * matx[2][1] * matx[1][2] +
        matx[0][1] * matx[0][1] * matx[2][2]

    println("Определитель матрицы равен: $dtm")


}