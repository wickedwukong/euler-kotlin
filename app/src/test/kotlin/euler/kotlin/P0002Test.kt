package euler.kotlin
import kotlin.test.Test
import kotlin.test.assertEquals


internal class P0002Test {

    @Test
    fun `the sum of the even Fibonacci numbers with upper limit of 44 `() {
        assertEquals(44, P0002(44).solution())
    }

    @Test
    fun `the sum of the even Fibonacci numbers with upper limit of 4M `() {
        assertEquals(4613732, P0002(4000000).solution())
    }
}
