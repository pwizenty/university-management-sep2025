package de.fhdo.sep.studentservice.client

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FeignClient(name = "ExamService")
interface ExamClient {
    @GetMapping(value = ["/resource/v1/exam/student/{id}"])
    fun getExamsForStudent(@PathVariable id: Long): List<String>
}