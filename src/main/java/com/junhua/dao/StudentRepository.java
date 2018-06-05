package com.junhua.dao;

import com.junhua.pojo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by xiejunhua on 2017/5/18.
 */
public interface StudentRepository extends MongoRepository<Student, Long>, StudentRepositoryCustom {

    Student findFirstByName(String name);

    //原生的json查询 ?0代表第一个参数
    @Query("{'name': ?0}")
    List<Student> findUsersByName(String name);
}
