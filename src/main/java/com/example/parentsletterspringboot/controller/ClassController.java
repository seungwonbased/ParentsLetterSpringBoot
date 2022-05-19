package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.mapper.ClassMapper;
import com.example.parentsletterspringboot.model.Classroom;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClassController {

    private ClassMapper mapper;

    public ClassController(ClassMapper mapper) {
        this.mapper = mapper;
    }

    // 조회
    @GetMapping("/class/{classId}")
    public Classroom getClassroom(@PathVariable("classId") String classId) {
        return mapper.getClassroom(classId);
    }

    @GetMapping("/class/all")
    public List<Classroom> getClassList() {
        return mapper.getClassroomList();
    }

    @GetMapping("/class/tName")
    public List<String> getTName() {
        return mapper.getTName();
    }

    @GetMapping("/class/className")
    public List<String> getClassName() {
        return mapper.getClassName();
    }

    // 삽입
    @PutMapping("/class/{classId}")
    public void putClass(@PathVariable int classId,
                         @RequestParam("className") String className,
                         @RequestParam("tName") String tName,
                         @RequestParam("tId") String tId) {
        mapper.insertClassroom(classId, className, tName, tId);
    }

    // 수정
    @PostMapping("/class/{classId}")
    public void postClass(@PathVariable("classId") int classId,
                          @RequestParam("className") String className,
                          @RequestParam("tName") String tName) {
        mapper.updateClassroom(classId, className, tName);
    }

    // 삭제
    @DeleteMapping("/class/{classId}")
    public void deleteClass(@PathVariable("classId") int classId) {
        mapper.deleteClassroom(classId);
    }

}
