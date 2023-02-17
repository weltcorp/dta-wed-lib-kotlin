import org.example.Bok
import org.example.Hello


suspend fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    println("hello")


    val b = Bok()
    b.hello()

    val h = Hello()
    h.hello()


}