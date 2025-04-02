package de.fhdo.sep.studentservice.service.impl

import de.fhdo.sep.studentservice.domain.Student
import de.fhdo.sep.studentservice.repository.StudentRepositoryI
import de.fhdo.sep.studentservice.service.StudentServiceI
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class StudentServiceImpl : StudentServiceI {
    @Autowired
    lateinit var studentRepository: StudentRepositoryI

    override fun create(student: Student): Student {
        return studentRepository.save(student)
    }

    override fun read(id: Long): Student? {
        return studentRepository.findById(id).orElse(null)
    }

    override fun update(student: Student): Student {
        return studentRepository.save(student)
    }

    override fun delete(id: Long) {
        val student = studentRepository.findById(id).orElse(null)
        // TODO: This is a problem when the student with the id does not exists.
        return studentRepository.delete(student)
    }

    override fun realAllStudents(): List<Student> {
        return studentRepository.findAll().toList()
    }
}