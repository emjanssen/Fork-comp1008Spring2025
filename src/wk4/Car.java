package wk4;

public class Car {

    public static String[] AVAILABLE_COLORS = "red,white,black,blue".split(",");
    private String color = AVAILABLE_COLORS[0], make = "Toyota", model = "Camry";
    private int doors=2, seats=2, wheels=4;

    //alt+insert


    public String getColor() {
        return color;
    }

    public void setColor(String color) {



        for(String currentColor : AVAILABLE_COLORS){
            if(currentColor.equals(color.toLowerCase())){
                this.color = currentColor;
                return;
            }
        }
        this.color = AVAILABLE_COLORS[0];
        System.err.println(color + " is invalid. Setting the color to " + this.color);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
}
