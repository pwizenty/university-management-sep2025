package de.fhdo.sep.studentservice.repository

import de.fhdo.sep.studentservice.domain.Student
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepositoryI : CrudRepository<Student, Long> {
}