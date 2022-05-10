package com.example.parentsletterspringboot.mapper;

import com.example.parentsletterspringboot.model.Classroom;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassMapper {

    @Select("SELECT * FROM Class where classId=#{classId}")
    Classroom getClassroom(@Param("classId") String classId);

    @Select("SELECT * FROM Class")
    List<Classroom> getClassroomList();

    @Select("SELECT tName FROM Class")
    List<String> getTName();

    @Select("SELECT className FROM Class")
    List<String> getClassName();

    @Insert("INSERT INTO Class VALUES(#{classId}, #{className}, #{tName})")
    int insertClassroom(@Param("classId") String classId,
                          @Param("className") String className,
                          @Param("tName") String tName);

    @Update("UPDATE Class SET className=#{className}, tName=#{tName} WHERE classId=#{classId}")
    int updateClassroom(@Param("classId") String classId,
                          @Param("className") String className,
                          @Param("tName") String tName);

    @Delete("DELETE FROM Class WHERE classId=#{classId}")
    int deleteClassroom(@Param("classId") String classId);

}
