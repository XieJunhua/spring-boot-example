package com.junhua.dao;

import com.junhua.pojo.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by xiejunhua on 2017/5/18.
 */
public interface StudentRepository extends MongoRepository<Student, Long>, StudentRepositoryCustom {

    Student findFirstByName(String name);
}
