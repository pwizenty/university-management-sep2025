package de.fhdo.sep.examservice.repository

import de.fhdo.sep.examservice.domain.Exam
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface ExamRepository : CrudRepository<Exam, Long> {
}