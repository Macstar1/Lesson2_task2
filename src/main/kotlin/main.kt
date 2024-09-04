fun main() {
    val likes = 111

    println("Понравилось $likes ${people(likes)}")
}

fun people(likes: Int): String {
    return if (likes == 1 || (likes % 10 == 1) &&
        (likes % 100 != 11) &&
        (likes != 11)
    ) {
        "человеку"
    } else {
        "людям"
    }
}