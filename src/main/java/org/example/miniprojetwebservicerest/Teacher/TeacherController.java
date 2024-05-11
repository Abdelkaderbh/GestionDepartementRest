package org.example.miniprojetwebservicerest.Teacher;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeacherController  {
    private final TeacherService teacherService ;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/addNew")
    public void addNew(@RequestBody Teacher teacher) {
        teacherService.addTeacher(teacher);
    }

    @GetMapping("/all")
    public List<Teacher> getAll() {
        return teacherService.getAllTeachers();
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id) {
        teacherService.deleteTeacher(id);
    }

    @PutMapping("/update/{id}")
    public void update(@PathVariable long id, @RequestBody Teacher teacher) {
        teacherService.updateTeacher(teacher);
    }

    @GetMapping("/teacher/{id}")
    public Teacher getTeacher(@PathVariable long id) {
        return teacherService.getTeacherById(id);
    }
}
