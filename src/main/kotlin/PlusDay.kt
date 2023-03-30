class PlusDay {
    /*fun no120956(babbling: Array<String>): Int {
        val canBabbling: Array<String> = arrayOf("aya", "ye", "woo", "ma")

        return babbling.map {
            var b = it
            canBabbling.forEach { b = b.replace(it, " ") }
            b
        }
            .count { it.isBlank() }
    }*/

    fun no120956(babbling: Array<String>) = babbling.count {
            it.split("aya", "ye", "woo", "ma").joinToString("").isBlank()
    }

    fun no120956Other(babbling: Array<String>): Int {
        val regex = "aya|ye|woo|ma".toRegex()
        val answer: Int = babbling.map { it.replace(regex, "") }
            .filter { it.length == 0 }
            .count()
        return answer
    }

}