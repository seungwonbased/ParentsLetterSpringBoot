package com.example.parentsletterspringboot.controller;

import com.example.parentsletterspringboot.mapper.BoardMapper;
import com.example.parentsletterspringboot.model.BoardVO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BoardController {

    private BoardMapper mapper;

    public BoardController(BoardMapper mapper) {
        this.mapper = mapper;
    }

    @PutMapping("/post/create")
    public void putBoard(@RequestParam("postName") String postName,
                         @RequestParam("postBody") String postBody) {
        mapper.insertBoard(postName, postBody);
    }

    @GetMapping("/post/all")
    public List<BoardVO> getBoardList() {
        return mapper.getBoardList();
    }

    @GetMapping("/post/{postNum}")
    public BoardVO getBoard(@PathVariable("postNum") String postNum) {
        return mapper.getBoard(postNum);
    }

}
