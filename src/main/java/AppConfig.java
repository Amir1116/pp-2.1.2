package main.java;

import org.springframework.context.annotation.*;

@Configuration
public class AppConfig {

    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat(){
        Cat cat = new Cat();
        cat.setName("CatName1");
        return cat;
    }
}