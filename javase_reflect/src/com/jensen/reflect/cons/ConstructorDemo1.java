package com.jensen.reflect.cons;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo1 {

    @Test
    public void testConstructor1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取到Class对象

        Class<User> userClass = User.class;
        //2.基于Class对象，获取到构造器（Constructor）
        Constructor<User> constructor = userClass.getConstructor();
        //3.利用构造器，创建对象
        User user = constructor.newInstance();
        //4.给对象赋值
        user.setName("熊大");
        user.setPassword("123456");
        System.out.println(user);
    }
}
