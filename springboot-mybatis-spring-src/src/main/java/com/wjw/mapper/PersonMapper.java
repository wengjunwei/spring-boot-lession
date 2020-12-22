package com.wjw.mapper;

import com.wjw.model.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    public Person selectById(int pid);

    public List<Person>  selectAll();

    public void insert(Person person);

}
