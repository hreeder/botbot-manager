package manager

import org.slf4j.LoggerFactory
import spark.Spark
import spark.Spark.get

fun main(args: Array<String>) {
    val PORT: Int = 8095
    val logger = LoggerFactory.getLogger("Manager")

    logger.info("Starting BotBot Manager, Please Wait")

    Spark.port(PORT)

    // Routing
    get("/", { req, res -> "Hello" })
}