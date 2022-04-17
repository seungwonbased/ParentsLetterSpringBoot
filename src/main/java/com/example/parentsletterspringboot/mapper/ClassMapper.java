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

    @Select("SELECT teacherInCharge FROM Class")
    List<String> getTeacherInCharge();

    @Select("SELECT className FROM Class")
    List<String> getClassName();

    @Insert("INSERT INTO Class VALUES(#{classId}, #{className}, #{teacherInCharge})")
    int insertClassroom(@Param("classId") String classId,
                          @Param("className") String className,
                          @Param("teacherInCharge") String teacherInCharge);

    @Update("UPDATE Class SET className=#{className}, teacherInCharge=#{teacherInCharge} WHERE classId=#{classId}")
    int updateClassroom(@Param("classId") String classId,
                          @Param("className") String className,
                          @Param("teacherInCharge") String teacherInCharge);

    @Delete("DELETE FROM Class WHERE classId=#{classId}")
    int deleteClassroom(@Param("classId") String classId);

}
