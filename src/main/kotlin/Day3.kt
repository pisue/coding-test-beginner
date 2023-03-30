class Day3{
    //나머지 구하기
    fun no120810(num1: Int, num2: Int) = num1 % num2

    //중앙값 구하기
    //배열 오름차순 array.sort()
    //배열 내림차순 array.sortDescending()
    //원본은 그대로 두고 새 배열에 소팅해서 담고 싶을 떈 sorted()를 사용
    fun no120812(array: IntArray) = array.sorted()[array.size / 2]

    //최빈값 구하기
    // 못풀었음 ㅠㅠ
    //https://onlyfor-me-blog.tistory.com/563 참고
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        return answer
    }

    //짝수는 싫어요
    //모범 답안
    fun solution(n: Int) = (0..n).filter { it % 2 == 1 }.toIntArray()
    //내가 푼거
    fun no120813(n: Int): IntArray {
        var answer: IntArray = intArrayOf()
        for(i: Int in 1..n step(2)) {answer = answer.plus(i)}
        return answer
    }

}