package de.fhdo.sep.examservice.service

import de.fhdo.sep.examservice.domain.Exam
import de.fhdo.sep.examservice.domain.ExamStudentDto

interface ExamServiceI {
    fun getAllExams(): List<Exam>
    fun getExamById(id: Long): Exam
    fun createExam(exam: Exam): Exam
    fun updateExam(exam: Exam): Exam
    fun deleteExam(id: Long)
    fun addStudentToExam(examStudentDto: ExamStudentDto): Exam
    fun getExamsForStudent(studentId: Long): List<String>
}