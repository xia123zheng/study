package com.xz.blog.mapper;

import com.xz.blog.model.Person;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserMapper {
    @Select("SELECT * FROM person WHERE id = #{id}")
    Person selectUser(int id);//返回一个person对象

    @Select("select * from person order by id")
    ArrayList<Person> selectAllUser();//返回一个person对象
}

