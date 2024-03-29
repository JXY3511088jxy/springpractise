package com.how2java.test;

import com.how2java.pojo.Category;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//配置springtest的驱动，这样就可以使用spring的注解了
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSpringjunit {
    @Autowired
    Category c;

    @Test
    public void test(){
        System.out.println(c.getName());
    }

}
