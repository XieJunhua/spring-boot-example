package com.junhua.dao;

import com.junhua.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by xiejunhua on 2017/5/18.
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User findById(@Param("id") int id);
}
