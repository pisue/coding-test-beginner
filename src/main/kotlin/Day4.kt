import java.lang.Math.ceil

class Day4 {
    //피자 나눠 먹기(1)
    fun no120814(n: Int): Int = if (n % 7 == 0) n / 7 else (n / 7) + 1
    fun no120814Other(n: Int) = ceil(n / 7.0) //ceil은 반올림

    //피자 나눠 먹기(3)
    fun no120816(slice: Int, n: Int) = ceil((n / slice.toDouble()))

    //배열의 평균값
    fun no120817(numbers: IntArray) = numbers.average()








}