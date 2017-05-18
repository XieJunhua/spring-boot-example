package com.junhua.controller;

import com.junhua.dao.StudentRepository;
import com.junhua.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by xiejunhua on 2017/5/17.
 */
//@RestController //@RestController is the same as @Controller + @ResponseBody , all method return value should be bound to the web response body
@Controller  //just indicates a Class as a Controller
public class TestController {


    Logger logger = LoggerFactory.getLogger(TestController.class);


//    @RequestMapping(value = "/", method = RequestMethod.GET) //This is old way
    @GetMapping("/")
    @ResponseBody // indicates a method return value should be bound to the web response body
    public String index() {

        logger.info("test logger");
        return "hello world";
    }

}
