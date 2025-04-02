package de.fhdo.sep.studentservice.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "student")
@Entity
class Student(
    @Id
    @GeneratedValue
    var id: Long? = null,
    var firstName: String?,
    var lastName: String?,
    var studentNumber: Int?
) {
    constructor() : this(null, null, null, null) {

    }
}