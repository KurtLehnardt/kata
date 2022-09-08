package com.kurtlehnardt.app;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.runApplication


@SpringBootApplication
class AnagramApplication

fun main(args: Array<String>) {
    runApplication<AnagramApplication>( * args)
    /*
    TODO
    a.       Write Unit Tests against the Spring Service
    d.       Add a Swagger User Interface to be able to more easily interact with the endpoint
    e.       Add authentication to the API (either Basic or OAuth)
     */
}



