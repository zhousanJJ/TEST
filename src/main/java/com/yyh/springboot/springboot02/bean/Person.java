package com.yyh.springboot.springboot02.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private int age;
    private Pet dog;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDog(Pet dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Pet getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dog=" + dog +
                '}';
    }
}
