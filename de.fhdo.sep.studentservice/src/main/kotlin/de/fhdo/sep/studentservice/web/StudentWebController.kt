package de.fhdo.sep.studentservice.web

import de.fhdo.sep.studentservice.domain.Student
import de.fhdo.sep.studentservice.service.StudentServiceI
import jakarta.annotation.PostConstruct
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping

@Controller
class StudentWebController {
    @Autowired
    lateinit var studentService: StudentServiceI


    @GetMapping("/")
    fun showCreateForm(model: Model, @ModelAttribute student: Student): String {
        val students = studentService.realAllStudents()
        model.addAttribute("students", students)
        return "index"
    }

    @PostMapping("/add")
    fun saveStudent(@ModelAttribute student: Student): String {
        studentService.create(student)
        return "redirect:/"
    }

    @PostConstruct
    // Create dummy students
    fun init() {
        var student = Student(null, "Josin", "Alkestes", 1337)
        studentService.create(student)
    }
}