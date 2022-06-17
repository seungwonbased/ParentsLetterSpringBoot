package com.example.parentsletterspringboot.mapper;

import com.example.parentsletterspringboot.model.KidsVO;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Mapper
public interface KidsMapper {

    @Select("SELECT * FROM kids")
    List<KidsVO> getKidsList();

    @Insert("INSERT INTO kids(kidsName, classId) VALUES(#{kidsName}, #{classId})")
    int insertKids(@Param("kidsName") String kidsName,
                   @Param("classId") int classId);

    @Delete("DELETE FROM kids WHERE kidsName=#{kidsName}")
    int deleteKids(@Param("kidsName") String kidsName);

}
