package com.jensen.reflect.example;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test1 {
    @Test
    public void testMethod() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("info.properties");
        properties.load(is);

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");
        System.out.println(className+" || "+methodName);

        Class aClass = Class.forName(className);
        Constructor cons = aClass.getConstructor();
        Object o = aClass.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(cons.newInstance());

    }
}
