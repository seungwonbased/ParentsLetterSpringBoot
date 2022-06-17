package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.mapper.ClassMapper;
import com.example.parentsletterspringboot.model.ClassNameVO;
import com.example.parentsletterspringboot.model.ClassroomVO;
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
    public ClassroomVO getClassroom(@PathVariable("classId") String classId) {
        return mapper.getClassroom(classId);
    }

    @GetMapping("/class/all")
    public List<ClassroomVO> getClassList() {
        return mapper.getClassroomList();
    }

    @GetMapping("/class/tName")
    public List<String> getTName() {
        return mapper.getTName();
    }

    @GetMapping("/class/className")
    public List<ClassNameVO> getClassName() {
        return mapper.getClassName();
    }

    // 삽입
    @PutMapping("/class/{className}")
    public void putClass(@PathVariable("className") String className,
                         @RequestParam("tName") String tName,
                         @RequestParam("tId") String tId) {
        mapper.insertClassroom(className, tName, tId);
    }

    // 수정
    @PostMapping("/class/{classId}")
    public void postClass(@PathVariable("classId") int classId,
                          @RequestParam("className") String className,
                          @RequestParam("tName") String tName) {
        mapper.updateClassroom(classId, className, tName);
    }

    // 삭제
    @DeleteMapping("/class/{className}")
    public void deleteClass(@PathVariable("className") String className) {
        mapper.deleteClassroom(className);
    }

}
