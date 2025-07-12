package wk9;

public class Week9 {

  public static void main(String[] args) {

    Animal a = new Animal();

    Cat c = new Cat();

    System.out.print(a.name);

    System.out.print(c.name);

    

    Animal a1 = new Animal("abc", 100, 987.6);

    Cat c1 = new Cat("efg", 200, 654.3);

    

    //System.out.print(a2.whiskers);

    

    a.setAge(10);

    System.out.print(a.getAge());

    

    c.setAge(100);

    System.out.print(c.getAge());



    Animal a2 = new Cat("dfafda", 300, 475.45);

    a2.setAge(50);

    System.out.print(a2.getAge());

    

    

    Person bruce = new Person("Bruce Wayne", 50, 170, 150);

    Hero batman = new Hero("Bruce Wayne", 50, 170, 150, "Money", "Batman");

    

    System.out.println(bruce);

    System.out.println(batman);

     System.out.println(bruce.fight("Georgian College Students"));

    System.out.println(batman.fight("Joker"));



    

  }

}
