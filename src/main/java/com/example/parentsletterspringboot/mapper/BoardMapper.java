package com.example.parentsletterspringboot.mapper;

import com.example.parentsletterspringboot.model.BoardVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

    @Insert("INSERT INTO board(postName, postBody) VALUES(#{postName}, #{postBody})")
    int insertBoard (@Param("postName") String postName,
                     @Param("postBody") String postBody);

    @Select("SELECT * FROM board")
    List<BoardVO> getBoardList();

    @Select("SELECT * FROM board where postNum=#{postNum}")
    BoardVO getBoard(@Param("postNum") String postNum);

}
