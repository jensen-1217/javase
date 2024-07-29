package com.jensen.reflect.filed;

import org.junit.Test;

import java.lang.reflect.Field;

public class FiledDemo1 {

    @Test
    public void testMethod4() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Teacher> teacherClass = Teacher.class;
        Teacher teacher = teacherClass.newInstance();

        Field field = teacherClass.getDeclaredField("name");
        field.setAccessible(true);
        field.set(teacher,"张三");
        Object o = field.get(teacher);

        System.out.println(o);
        System.out.println(field);

    }

    @Test
    public void testMethod3() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Teacher> teacherClass = Teacher.class;
        Teacher teacher = teacherClass.newInstance();

        Field field = teacherClass.getField("id");
        field.set(teacher,100);
        Object o = field.get(teacher);

        System.out.println(o);

    }

    @Test
    public void testMethod2() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Teacher> teacherClass = Teacher.class;

        Field[] fields = teacherClass.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field);
        }

    }

    @Test
    public void testMethod1() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<Teacher> teacherClass = Teacher.class;

        Field[] fields = teacherClass.getFields();

        for (Field field : fields) {
            System.out.println(field);
        }

    }
}
