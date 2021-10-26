package main.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        cat1.setName("cat1");
        cat2.setName("cat2");

        System.out.println(bean1.getMessage());
        System.out.println(bean2.getMessage());
        System.out.println(cat1.getName());
        System.out.println(cat2.getName());

        System.out.println("bean1 == bean2 " + (bean1 == bean2));
        System.out.println("cat1 == cat2 " + (cat1 == cat2));
    }
}