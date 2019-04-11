package com.baizhi;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemo3ApplicationTests {
    @Autowired
    StudentDao studentDao;

    @Test
    public void contextLoads() {
        List<Student> list = studentDao.selectAll();
        for(Student student:list){
            System.out.println(student);
        }
    }

}
