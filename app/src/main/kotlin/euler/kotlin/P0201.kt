package euler.kotlin

/*Subsets with a unique sum*/

class P0201(private val numberSet: Set<Int>) {
    fun solution(numOfValuesInSubset: Int): Int {
        return numberSet.sum()
    }
}
