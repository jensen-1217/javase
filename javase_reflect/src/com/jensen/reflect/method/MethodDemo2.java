package com.jensen.reflect.method;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo2 {
    @Test
    public void testMethod5() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method method = studentClass.getDeclaredMethod("hello", String.class);

        method.setAccessible(true);

       method.invoke(null, "张三");


    }

    @Test
    public void testMethod4() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method method = studentClass.getDeclaredMethod("sayHello", String.class, String.class);

        method.setAccessible(true);

        Object result = method.invoke(student, "你好", "张三");

        System.out.println(result);

    }

    @Test
    public void testMethod3() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method method = studentClass.getMethod("sleep", String.class);

        method.invoke(student,"张三");

    }

    @Test
    public void testMethod2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method[] methods = studentClass.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

    }

    @Test
    public void testMethod() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //1.获取Class对象
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();

        //2.基于Class对象，获取到Method对象（成员方法对象）
        Method[] methods = studentClass.getMethods();

        for (Method method : methods) {
            System.out.println(method);
        }

    }
}
