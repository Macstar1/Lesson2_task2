fun main() {
    val likes = 121

    fun people(likes: Int):String {
        if (likes == 1 || (likes % 10 == 1) &&
            (likes % 100 != 11) &&
            likes != 11){
            return "человеку"
        }
        else{
            return "людям"
        }
    }
    println("Понравилось $likes ${people(likes)}")
}