package com.jensen.reflect.cons;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ConstructorDemo3 {
    @Test
    public void testMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
       // UserServiceImp userService = new UserServiceImp();

        //模拟配置文件
        String className="com.jensen.reflect.cons.UserServiceImp2";

        Class aClass = Class.forName(className);

        Constructor cons= aClass.getConstructor();

        UserService userService= (UserService)cons.newInstance();


        List<User> usersList  = userService.queryAllUser();

        for (User user : usersList) {
            System.out.println(user);
        }
    }
}
