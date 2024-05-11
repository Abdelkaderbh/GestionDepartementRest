package org.example.miniprojetwebservicerest.Teacher;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {
    @Autowired
    private TeacherRepository teacherRepository;

    public void addTeacher(Teacher teacher) {
        teacherRepository.save(teacher);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    public Teacher getTeacherById(long id) {
        return teacherRepository.findById(id).orElse(null);
    }

    public void deleteTeacher(long id) {
        teacherRepository.deleteById(id);
    }

    public void updateTeacher(Teacher teacher) {
        Teacher isExist = teacherRepository.findById(teacher.getId()).orElse(null);
        if (isExist != null) {
            isExist.setNom(teacher.getNom());
            isExist.setEmail(teacher.getEmail());
            isExist.setMatiere(teacher.getMatiere());
            teacherRepository.save(isExist);
        }
    }
}
