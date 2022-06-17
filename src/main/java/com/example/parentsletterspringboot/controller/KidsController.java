package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.mapper.KidsMapper;
import com.example.parentsletterspringboot.model.KidsVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KidsController {

    private KidsMapper mapper;

    public KidsController(KidsMapper mapper) {
        this.mapper = mapper;
    }

    @GetMapping("/kids/all")
    public List<KidsVO> getKidsList() {
        return mapper.getKidsList();
    }

    @PutMapping("/kids/register")
    public void insertKids(@RequestParam("kidsName") String kidsName,
                           @RequestParam("classId") int classId) {
        mapper.insertKids(kidsName, classId);
    }

    @DeleteMapping("/kids/delete")
    public void deleteKids(@RequestParam("kidsName") String kidsName) {
        mapper.deleteKids(kidsName);
    }
}
