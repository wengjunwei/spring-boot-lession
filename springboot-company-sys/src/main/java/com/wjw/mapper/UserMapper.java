package com.wjw.mapper;


import com.wjw.model.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Insert("insert into my_user values(null, #{username}, #{password}, #{p_addr}, #{gender}, #{birth})")
    public void insert(User user);

    @Select("select * from my_user where pid = #{empId}")
    public User getById(int empId);

    @Select("select * from my_user ")
    public List<User> list();

    @Update("update my_user set username = #{username}, " +
            "password = #{password}, " +
            "p_addr = #{p_ddr}, " +
            "gender = #{gender}, " +
            "birth = #{birth} where pid = #{pid}")
    public void update(User user);

    @Delete("delete from my_user where pid = #{empId}")
    public void delete(int empId);

}
