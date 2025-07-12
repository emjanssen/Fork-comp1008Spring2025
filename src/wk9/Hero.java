package wk9;

public class Hero extends Person{

  String power, heroName;

   

  public Hero(){}

  public Hero(String name, int age, double weight, double height){

     

    super(name, age, weight, height);

  }

  public Hero(String name, int age, double weight, double height, String power, String heroName){



      super(name, age, weight, height);

      this.power = power;

      this.heroName = heroName;



  }

  @Override

  public String fight(String opponent){

    return heroName + " fights " + opponent;

  }

  @Override

  public String toString(){

    return super.toString().substring(0, 

    super.toString().length() - 1) + String.format(", hero name = %s, super power = %s\n", heroName, power);

  }

}









