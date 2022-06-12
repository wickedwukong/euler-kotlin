package euler.kotlin

import kotlin.test.Test
import kotlin.test.assertEquals


internal class P0201Test {
    @Test
    fun `Set of 1 number`() {
        assertEquals(1, P0201(setOf(1)).solution(1))
    }

    @Test
    fun `Set of 2 numbers`() {
        assertEquals(3, P0201(setOf(1, 2)).solution(1))
    }

}
