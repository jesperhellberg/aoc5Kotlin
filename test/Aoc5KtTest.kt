import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

internal class Aoc5KtTest {

    val inputStrings = File("testinput.txt").readLines()
    val testinput = inputStrings.map{it.toInt()}.toMutableList()


    @Test
    fun version1() {
        assertEquals(5, version1(testinput))
    }

    @Test
    fun version2() {
        assertEquals(10, version2(testinput))
    }
}