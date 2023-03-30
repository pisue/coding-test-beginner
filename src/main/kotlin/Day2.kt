
class Day2 {
    //두 수의 나눗셈
    fun no120806(num1: Int, num2: Int): Int = (num1.toDouble() / num2 * 1000).toInt()

    //숫자 비교하기
    fun no120807(num1: Int, num2: Int): Int = if(num1==num2) 1 else -1

    //분수의 덧셈 -> 풀지 못했다..
    fun no120808(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var answer: IntArray = intArrayOf()
        return answer
    }

    //배열 두 배 만들기
    fun no120809(numbers: IntArray) = numbers.map { it * 2 }

}
