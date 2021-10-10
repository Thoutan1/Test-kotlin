package module.main
import kotlin.random.Random

fun randomAlphaNumericString(desiredStrLength: Int): String {
    val charPool: List<Char> = ('a'..'z') + ('A'..'Z') + ('0'..'9')

    return (1..desiredStrLength)
        .map{ Random.nextInt(0, charPool.size) }
        .map(charPool::get)
        .joinToString("")
}