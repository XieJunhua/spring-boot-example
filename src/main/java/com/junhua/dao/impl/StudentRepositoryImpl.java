package com.junhua.dao.impl;

import com.junhua.dao.StudentRepositoryCustom;
import com.junhua.pojo.Student;
import com.mongodb.WriteResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import java.util.List;

/**
 * Created by xiejunhua on 2017/5/18.
 * notice the class name must be StudentRepositoryImpl mustn't be StudentRepositoryCustomImpl
 */
public class StudentRepositoryImpl implements StudentRepositoryCustom {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public int updateHobby(String name, List hobbies) {
        Query query = new Query(Criteria.where("name").is(name));

        Update update = new Update().set("hobby", hobbies);

        WriteResult result = mongoTemplate.updateFirst(query, update, Student.class);

        if (result != null) {
            return result.getN();
        } else {
            return 0;
        }
    }
}
