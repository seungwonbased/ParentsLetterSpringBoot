package com.example.parentsletterspringboot.mapper;

import com.example.parentsletterspringboot.model.UsersVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersMapper {

    @Select("SELECT * FROM users WHERE id=#{id}")
    UsersVO getUsers(@Param("id") String id);

    @Select("SELECT * FROM users")
    List<UsersVO> getUsersList();

    @Select("SELECT id FROM users")
    List<String> getUsersId();

    @Insert("INSERT INTO users VALUES(#{id}, #{pw}, #{phone}, #{name}, #{isTeacher})")
    int insertUsers(@Param("id") String id,
                 @Param("pw") String pw,
                 @Param("phone") String phone,
                 @Param("name") String name,
                 @Param("isTeacher") int isTeacher);
    @Select("SELECT * FROM users WHERE id=#{id} AND pw={pw}")
    UsersVO login(@Param("id") String id,
                   @Param("pw") String pw);
}
