package de.fhdo.sep.examservice.api

import de.fhdo.sep.examservice.domain.Exam
import de.fhdo.sep.examservice.domain.ExamStudentDto
import de.fhdo.sep.examservice.service.ExamServiceI
import jakarta.annotation.PostConstruct
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
@RequestMapping(value = ["/resource/v1/exam"])
class ExamController {
    @Autowired
    lateinit var examService: ExamServiceI

    @GetMapping(path = ["/{id}"])
    fun getExam(@PathVariable id: Long): Exam? {
        return examService.getExamById(id)
    }

    @GetMapping(path = ["/exams"])
    fun getExams(): List<Exam> {
        return examService.getAllExams()
    }

    @PostMapping
    fun createExam(@RequestBody exam : Exam) : Exam {
        return examService.createExam(exam)
    }

    @PutMapping()
    fun updateExam(@RequestBody exam: Exam) : Exam {
        return examService.updateExam(exam)
    }

    @DeleteMapping(path = ["/{id}"])
    fun deleteExam(@PathVariable id: Long) {
        return examService.deleteExam(id)
    }

    @PutMapping(path = ["/add/student"])
    fun addStudentToExam(@RequestBody examStudent: ExamStudentDto) : Exam {
        return examService.addStudentToExam(examStudent)
    }

    @GetMapping(path = ["/student/{id}"])
    fun getExamsForStudent(@PathVariable id: Long): List<String> {
        return examService.getExamsForStudent(id)
    }

    @PostConstruct
    fun init() {
        val exam = Exam(null, "SEP")
        exam.participants.add(1337)
        examService.createExam(exam)
    }
}