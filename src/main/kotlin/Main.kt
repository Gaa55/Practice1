fun main(args: Array<String>) {
//1
    fun printFullName(firstName: String, lastName: String) {
        val fullName = "$firstName $lastName"
        println("Полное имя: $fullName")
    }

//2
    printFullName(firstName = "Иван", lastName = "Иванов")

    // 3
    fun calculateFullName(firstName: String, lastName: String): String {
        return "$firstName $lastName"
    }


    val myFullName: String = calculateFullName(firstName = "Ваше", lastName = "Имя")


    //4
    fun calculateFullNameAndLength(firstName: String, lastName: String): Pair<String, Int> {
        val fullName = "$firstName $lastName"
        val length = fullName.length
        return Pair(fullName, length)
    }

    val (myFullNameWithLength, fullNameLength) = calculateFullNameAndLength(firstName = "Ваше", lastName = "Имя")
    println("Мое полное имя: $myFullNameWithLength, длина имени: $fullNameLength")

    //5
    fun isPrime(number: Int): Boolean {
        if (number <= 1) return false
        for (i in 2 until number) {
            if (number % i == 0) return false
        }
        return true
    }

    // 6
    fun fibonacci(n: Int): Int {
        if (n <= 0) return 0
        if (n == 1 || n == 2) return 1
        var prev = 1
        var current = 1
        for (i in 3..n) {
            val next = prev + current
            prev = current
            current = next
        }
        return current
    }

    val fibonacciValue = fibonacci(10)
    println("Число Фибоначчи для n=10: $fibonacciValue")
}