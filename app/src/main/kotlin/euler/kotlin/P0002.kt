package euler.kotlin

class P0002(private val upperLimit: Int) {
    fun solution(): Int {
        var x = 1
        var y = 2
        var sum = 0
        while (x < upperLimit) {
            var z = x + y
            x = y
            y = z
            if (x % 2 == 0) {
                sum += x
            }
        }
        return sum
    }
}
