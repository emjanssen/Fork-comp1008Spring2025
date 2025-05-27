package wk4;

import java.util.Random;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static Person Adolescent(String name){
        return new Person(name, new Random().nextInt(13, 17));
    }
    public static Person Adult(){
        return new Person("Adult", new Random().nextInt(18, 65));
    }
}
