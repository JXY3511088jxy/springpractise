package com.how2java.test;


import com.how2java.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringtestng extends AbstractTestNGSpringContextTests {
    //继承AbstractTestNGSpringContextTests，就可以使用spring的注解了；效果与junit的Runwith一样
    @Autowired
    Category c;

    @Test
    public void test(){
        System.out.println(c.getName());
    }


}
