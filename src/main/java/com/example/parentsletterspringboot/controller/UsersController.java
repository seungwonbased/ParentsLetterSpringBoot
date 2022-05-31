package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.exception.UserNotFoundException;
import com.example.parentsletterspringboot.mapper.UsersMapper;
import com.example.parentsletterspringboot.model.UsersVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsersController {

    private UsersMapper mapper;
    private UsersVO vo;

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

    @PutMapping("/users/register")
    public void registerUsers(@RequestParam("id") String id,
                              @RequestParam("pw") String pw,
                              @RequestParam("phone") String phone,
                              @RequestParam("name") String name,
                              @RequestParam("isTeacher") int isTeacher) {
        mapper.insertUsers(id, pw, phone, name, isTeacher);
    }

    @GetMapping("/users/login")
    public void login(@RequestParam("id") String id,
                      @RequestParam("pw") String pw) throws UserNotFoundException {

        vo = mapper.login(id, pw);
        
        if (!vo.equals(null)) {
            System.out.println(vo);
        } else {
            throw new UserNotFoundException("User not found with id: " + id);
        }

    }





}
