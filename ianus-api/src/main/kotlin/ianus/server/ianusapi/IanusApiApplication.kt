package ianus.server.ianusapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class IanusApiApplication

fun main(args: Array<String>) {
    runApplication<IanusApiApplication>(*args)
}
