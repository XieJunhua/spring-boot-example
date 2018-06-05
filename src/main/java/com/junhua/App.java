package com.junhua;

import com.junhua.dao.StudentRepository;
import com.junhua.dao.UserMapper;
import com.junhua.pojo.Student;
import com.junhua.pojo.User;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.MongoTemplate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xiejunhua on 2017/5/17.
 */
@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(App.class);
        app.run(args);
    }

    @Bean
    CommandLineRunner init(MongoTemplate mongoTemplate, StudentRepository studentRepository, UserMapper userMapper) {

        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {

//                Student student = new Student();
//                ArrayList arrayList = new ArrayList();
//                arrayList.add("watch tv");
//                arrayList.add("read book");
//                Map map = new HashMap<String, Integer>();
//                map.put("math", 80);
//                map.put("English", 70);
//                student.setId(1L);
//                student.setName("xiaoming");
//                student.setHobby(arrayList);
//                student.setGrade(map);
//                studentRepository.insert(student);
//                Student student1 = studentRepository.findFirstByName("xiaoming");
//                System.out.println(student1);
//                arrayList = new ArrayList();
//                arrayList.add("new hobby1");
//                arrayList.add("new hobby2");
//
//
//
//                DBCollection dbCollection = mongoTemplate.getCollection("student");
//                //拿到这个对象之后，操作方式就合官方驱动相同了
//                BasicDBObject basicDBObject = new BasicDBObject();
//                basicDBObject.append("name", "xiaoming");
//                DBCursor dbCursor = dbCollection.find(basicDBObject);
//                while (dbCursor.hasNext()) {
//                    System.out.println(dbCursor.next());
//                }

                User user = userMapper.findById(1);
                System.out.println(user);
            };
        };
    }



}
