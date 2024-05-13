package org.example.miniprojetwebservicerest.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public void  addStudent(Student student) {
        studentRepository.save(student);
    }

    public Student getStudentById(long id) {
        return studentRepository.findById(id).orElse(null);
    }

     public void updateStudent(long id,Student student) {
         Student existingStudent = studentRepository.findById(id).orElse(null);
         if (existingStudent != null) {
             existingStudent.setName(student.getName());
             existingStudent.setEmail(student.getEmail());
             studentRepository.save(existingStudent);
         }
     }

     public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
     }
}
