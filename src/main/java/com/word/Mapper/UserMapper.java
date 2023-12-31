package com.word.Mapper;

import com.word.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from users where id=#{id} and password=#{password}")
    User getUserByIdAndPassword(String id, String password);

    @Select("select * from users where id=#{id}")
    User getUserById(String id);
}
