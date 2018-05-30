import java.io.File

fun main(args: Array<String>) {
    val input = File("input.txt").readLines().map{it.toInt()}

    println(version1(input.toMutableList()))
    println(version2(input.toMutableList()))
}

fun version1(input: MutableList<Int>): Int {
    var currentPos = 0
    var counter = 0

    while (currentPos in input.indices) {
        currentPos += input[currentPos] ++
        counter++
    }
    return counter
}

fun version2(input: MutableList<Int>): Int {
    var counter = 0
    var currentPos = 0

    while (currentPos in input.indices) {
        currentPos += if(input[currentPos] < 3) input[currentPos]++ else input[currentPos]--
        counter++
    }
    return counter
}

