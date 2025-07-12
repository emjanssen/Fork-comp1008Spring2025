package wk9;
public class Animal{

  private int age;

  public String name = "Animal";

  protected double weight;

  public int getAge(){return age;}

  public void setAge(int age){this.age = age;}

  public Animal(){}

  public Animal(String name, int age, double weight){

    setAge(age);

    this.name = name;

    this.weight = weight;

  }

}


