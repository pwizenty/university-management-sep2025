package de.fhdo.sep.studentservice.service

import de.fhdo.sep.studentservice.domain.Student

interface StudentServiceI {
    fun create(student: Student): Student
    fun read(id: Long): Student?
    fun update(student: Student): Student
    fun delete(id: Long)
    fun realAllStudents(): List<Student>
}