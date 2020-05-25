package com.danya;

import org.apache.commons.lang.StringUtils;

public class Person {

    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }




    public void setName(String name) {
        if(null == name || name.isEmpty())
            throw new IllegalArgumentException("Invalid name!");
        this.name = StringUtils.strip(name);
    }

    public void setAge(int age) {
        if (0 < age || age > 100){
            System.out.println("年龄的值输入有误，请重新输值");
            throw new IllegalArgumentException("Invalid age value!");

        }
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
