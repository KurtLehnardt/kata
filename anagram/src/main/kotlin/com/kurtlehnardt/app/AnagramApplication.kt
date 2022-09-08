package com.kurtlehnardt.app;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication


@SpringBootApplication
class AnagramApplication

fun main(args: Array<String>) {
    runApplication<AnagramApplication>( * args)
    /*
    TODO
    2. Add a Swagger User Interface to be able to more easily interact with the endpoint
    3. Add authentication to the API (either Basic or OAuth)
    4. API error handling
    */
}



