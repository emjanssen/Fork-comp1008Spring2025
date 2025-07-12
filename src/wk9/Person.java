package wk9;

public class Person{

  public String name;

  public int age;

  public double weight, height;

   

  public Person(){}

  public Person(String name, int age, double weight, double height){

     

    this.name = name;

    this.age = age;

    this.weight = weight;

    this.height = height;

  }

  @Override

  public String toString(){

    return String.format("Name=%s, Age=%d, Weight=%.1f, Height=%.1f\n", name, age, weight, height);

  }

  public String fight(String opponent){

    return name + " runs away from " + opponent;

  }

}



