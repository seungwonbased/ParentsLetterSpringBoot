package com.example.parentsletterspringboot.mapper;

import com.example.parentsletterspringboot.model.ClassroomVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassMapper {

    @Select("SELECT * FROM Class where classId=#{classId}")
    ClassroomVO getClassroom(@Param("classId") String classId);

    @Select("SELECT * FROM Class")
    List<ClassroomVO> getClassroomList();

    @Select("SELECT tName FROM Class")
    List<String> getTName();

    @Select("SELECT className FROM Class")
    List<String> getClassName();

    @Insert("INSERT INTO Class VALUES(#{className}, #{tName}, #{tId})")
    int insertClassroom(@Param("className") String className,
                        @Param("tName") String tName,
                            @Param("tId") String tId);

    @Update("UPDATE Class SET className=#{className}, tName=#{tName} WHERE classId=#{classId}")
    int updateClassroom(@Param("classId") int classId,
                          @Param("className") String className,
                          @Param("tName") String tName);

    @Delete("DELETE FROM Class WHERE classId=#{classId}")
    int deleteClassroom(@Param("classId") int classId);

}
