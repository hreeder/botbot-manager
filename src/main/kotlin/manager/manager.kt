package manager

import spark.Spark
import spark.Spark.get

fun main(args: Array<String>) {
    val PORT: Int = 8095
    Spark.port(PORT)

    get("/", { req, res -> "Hello" })

    println("Listening On 0.0.0.0:$PORT")
}