package com.jensen.reflect.cls;

import org.junit.Test;

import java.io.IOException;
import java.util.Properties;

public class GetClassDemo2 {

    @Test
    public void testGetClass3(){
        Class studentClass = Student.class;
        System.out.println(studentClass);
    }

    @Test
    public void testGetClass2(){
        method(new Student());
    }

    public void method(Student stu){
        Class stuClass = stu.getClass();
        System.out.println(stuClass);
    }

    @Test
    public void testGetClass() throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(GetClassDemo2.class.getClassLoader().getResourceAsStream("student.ini"));
        String className = properties.getProperty("className");
        Class cls = Class.forName(className);
        System.out.println(cls);
    }
}
