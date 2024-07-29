package com.jensen.reflect.method;

public class Student {
    public Student() {
    }

    public void study(){
        System.out.println("努力学习....");
    }
    public void sleep(String name){
        System.out.println(name+"上课睡觉~~~");
    }
    private String sayHello(String msg,String name){
        return msg+name;
    }

    public static void hello(String name){
        System.out.println(name);
    }
}
