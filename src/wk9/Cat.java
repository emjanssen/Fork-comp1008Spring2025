package wk9;


public class Cat extends Animal{

  public int whiskers;

  public Cat(){}

  public Cat(String name, int age, double weight){

    super(name, age, weight);

    /*

    this.name = name;

    setAge(age);

    this.weight = weight;

    */

  }

   

  @Override

  public void setAge(int age){

    super.setAge(age / 2);

  }

   

}






