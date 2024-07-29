package com.jensen.reflect.cons;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ConstructorDemo2 {

    @Test
    public void testGetConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取到Class对象
        Class<User> userClass = User.class;

        //2.基于Class对象，获取到构造器（Constructor）
        Constructor<User> constructor = userClass.getConstructor(String.class,String.class);

        //3.测试
        User user = constructor.newInstance("光头强", "123456");
        System.out.println(user);


    }

    @Test
    public void testGetDeclareConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取到Class对象
        Class<User> userClass = User.class;

        //2.基于Class对象，获取到构造器（Constructor）
        Constructor<User> cons = userClass.getDeclaredConstructor(String.class);

        //取消权限检查
        cons.setAccessible(true);
        //3.使用私有构造器，创建对象
        User user = cons.newInstance("熊二");
        /*继承中，父类私有内容是可以访问的，但是由于java语言有权限过滤，故：不允许权限外的内容（私有内容，子类不能访问）
        *Class对象中存储有private构造器，由于java语言有权限过滤，故：不允许访问私有构造器
        *
        *反射技术的强大：暴力破解（可以设置本次访问时暂时取消权限检查）
        * 使用API方法：setAccessible（true） 表示取消权限检查
        *             必须书写在创建对象之前
        * */

        System.out.println(user);

    }

    @Test
    public void testGetDeclaredConstructor() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取到Class对象
        Class<User> userClass = User.class;

        //2.基于Class对象，获取到构造器（Constructor）
        Constructor<?>[] constructors = userClass.getDeclaredConstructors();

        //3.测试
        for (Constructor<?> cons : constructors) {
            System.out.println(cons);
        }

    }

    @Test
    public void testConstructor1() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取到Class对象
        Class<User> userClass = User.class;

        //2.基于Class对象，获取到构造器（Constructor）
        Constructor<?>[] constructors = userClass.getConstructors();

        //3.测试
        for (Constructor<?> cons : constructors) {
            System.out.println(cons);
        }

    }
}
