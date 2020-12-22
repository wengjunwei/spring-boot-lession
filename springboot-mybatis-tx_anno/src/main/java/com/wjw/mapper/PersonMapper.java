package com.wjw.mapper;

import com.wjw.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@Mapper
public interface PersonMapper {

    @Select("select * from person t where t.pid=#{pid}")
    public Person selectById(int pid);

    @Select("select * from person")
    public List<Person>  selectAll();

    @Options(useGeneratedKeys = true,keyProperty = "pid")
    @Insert("insert into person(pid, pname, addr, gender, birth) values(#{pid},#{pname},#{addr},#{gender},#{birth} )")
    public void insert(Person person);

}
