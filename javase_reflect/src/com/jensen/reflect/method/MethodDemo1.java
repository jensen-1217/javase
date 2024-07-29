package com.jensen.reflect.method;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo1 {

    @Test
    public void testMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method method = studentClass.getMethod("study");

        //3.利用Method对象，运行方法
        method.invoke(student);

    }
}
