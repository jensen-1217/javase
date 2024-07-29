package com.jensen.classloader;

import org.junit.Test;

public class Test1 {
    @Test
    public void testClassLoader(){
        Class test1Class = Test1.class;

        ClassLoader appClassLoader = test1Class.getClassLoader();
        System.out.println(appClassLoader);//sun.misc.Launcher$AppClassLoader@18b4aac2

        ClassLoader parent = appClassLoader.getParent();
        System.out.println(parent);

        ClassLoader parent1 = parent.getParent();
        System.out.println(parent1);
    }
}
