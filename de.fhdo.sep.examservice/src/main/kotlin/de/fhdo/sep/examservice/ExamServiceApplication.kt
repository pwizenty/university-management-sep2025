package de.fhdo.sep.examservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ExamServiceApplication

fun main(args: Array<String>) {
	runApplication<ExamServiceApplication>(*args)
}
