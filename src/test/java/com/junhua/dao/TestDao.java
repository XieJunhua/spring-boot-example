package com.junhua.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by xiejunhua on 2017/8/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestDao {
    @Resource(type = Test1DaoImpl1.class)
    @Autowired
        @Qualifier(value = "test1DaoImpl1")
    Test1Dao test1Dao;

    @Test
    public void test() {
        System.out.println(test1Dao.test());
//        ConcurrentHashMap

    }
}
