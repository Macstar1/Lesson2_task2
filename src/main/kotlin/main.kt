fun main() {
    val likes = 121

    fun people(likes: Int): String {
        return if (likes == 1 || (likes % 10 == 1) &&
            (likes % 100 != 11) &&
            likes != 11
        ) {
            "человеку"
        } else {
            "людям"
        }
    }

    println("Понравилось $likes ${people(likes)}")
}