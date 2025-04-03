package de.fhdo.sep.studentservice.api

import de.fhdo.sep.studentservice.domain.Student
import de.fhdo.sep.studentservice.service.StudentServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["/resource/v1/student"])
class StudentController {
    @Autowired
    lateinit var studentService: StudentServiceI

    @GetMapping(path = ["/{id}"])
    fun getStudent(@PathVariable id: Long): Student? {
        return studentService.read(id)
    }

    @GetMapping(path = ["/students"])
    fun getAllStudents(): List<Student> {
        return studentService.realAllStudents()
    }

    @PostMapping
    fun createStudent(@RequestBody student: Student): Student {
        return studentService.create(student)
    }

    @PutMapping
    fun updateStudent(@RequestBody student: Student): Student {
        return studentService.update(student)
    }

    @DeleteMapping(path = ["/{id}"])
    fun deleteStudent(@PathVariable id: Long) {
        return studentService.delete(id)
    }

    @GetMapping(path = ["/{id}/exams"])
    fun getExamsForStudent(@PathVariable id: Long): List<String> {
        return studentService.getExamsForStudent(id)
    }
}