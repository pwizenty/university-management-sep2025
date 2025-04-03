package de.fhdo.sep.examservice.service.impl

import de.fhdo.sep.examservice.domain.Exam
import de.fhdo.sep.examservice.domain.ExamStudentDto
import de.fhdo.sep.examservice.repository.ExamRepository
import de.fhdo.sep.examservice.service.ExamServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExamService : ExamServiceI {
    @Autowired
    lateinit var examRepository: ExamRepository

    override fun getAllExams(): List<Exam> {
        return examRepository.findAll().toList()
    }

    override fun getExamById(id: Long): Exam {
        // Quick and dirty
        return examRepository.findById(id).orElseGet(null)
    }

    override fun createExam(exam: Exam): Exam {
        return examRepository.save(exam)
    }

    override fun updateExam(exam: Exam): Exam {
        return examRepository.save(exam)
    }

    override fun deleteExam(id: Long) {
        return examRepository.deleteById(id)
    }

    override fun addStudentToExam(examStudentDto: ExamStudentDto): Exam {
        val exam = examRepository.findById(examStudentDto.examId).get()
        exam.participants.add(examStudentDto.studentId)
        return examRepository.save(exam)
    }

    override fun getExamsForStudent(studentId: Long): List<String> {
        val exams = examRepository.findAll().toList()
        val examsForStudent = exams.filter { e -> e.participants.contains(studentId) }
        val names = examsForStudent.map { it.name }
        return names
    }
}