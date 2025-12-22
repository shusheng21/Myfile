package com.rao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Girl {
    @Value("注解小美")
    private String name;
    @Value("25")
    private int age;
    @Autowired
    private Boy  boyfriend;

    public Girl() {
    }

    public Girl(String name, Boy boyfriend, int age) {
        this.name = name;
        this.boyfriend = boyfriend;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boy getBoyfriend() {
        return boyfriend;
    }

    public void setBoyfriend(Boy boyfriend) {
        this.boyfriend = boyfriend;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
