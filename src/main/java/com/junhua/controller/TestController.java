package com.junhua.controller;

import com.alibaba.fastjson.JSONObject;
import com.junhua.dao.StudentRepository;
import com.junhua.pojo.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

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

    @RequestMapping("/test")
    public String test(Model model) {
//        ModelMap model = new ModelMap();
        List arrlist = new ArrayList();
        arrlist.add("ts");
        model.addAttribute("users", arrlist);
        return "test1";
    }

    @PostMapping("/tongdun")
    @ResponseBody
    public String tongdun(@RequestBody Map map) {

        System.out.println(map);

        Map map1 = new HashMap();
        if ("123456".equals(map.get("token"))) {
            map1.put("tongdun", "tongdunid");
            map1.put("dddd", "dddd1");
        }


        JSONObject jsonObject = new JSONObject(map1);
        String str = jsonObject.toJSONString();





        return str;

    }

}
