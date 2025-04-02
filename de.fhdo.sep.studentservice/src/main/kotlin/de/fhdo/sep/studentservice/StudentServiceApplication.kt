package de.fhdo.sep.studentservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class StudentServiceApplication

fun main(args: Array<String>) {
	runApplication<StudentServiceApplication>(*args)
}
