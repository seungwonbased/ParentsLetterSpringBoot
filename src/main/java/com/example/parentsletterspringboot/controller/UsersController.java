package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.mapper.UsersMapper;
import com.example.parentsletterspringboot.model.UsersVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private UsersMapper mapper;

    public UsersController(UsersMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/users/{id}")
    public UsersVO getUser(@PathVariable("id") String id) {
        return mapper.getUsers(id);
    }

    @GetMapping("/users/all")
    public List<UsersVO> getUsersList() {
        return mapper.getUsersList();
    }

    @PutMapping("/users/{id}")
    public void putUsers(@PathVariable("id") String id,
                         @RequestParam("pw") String pw,
                         @RequestParam("phone") String phone,
                         @RequestParam("name") String name,
                         @RequestParam("isTeacher") int isTeacher) {
        mapper.insertUsers(id, pw, phone, name, isTeacher);
    }




}
