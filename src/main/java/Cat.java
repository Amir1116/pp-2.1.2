package main.java;

import org.springframework.stereotype.Component;

@Component
public class Cat {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String str){
        this.name = str;
    }
}
