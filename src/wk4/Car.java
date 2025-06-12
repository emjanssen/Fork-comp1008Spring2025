package wk4;

public class Car {

    public static String[] AVAILABLE_COLORS = "red,white,black,blue".split(",");
    private String color = AVAILABLE_COLORS[0], make = "Toyota", model = "Camry";
    private int doors=2, seats=2, wheels=4;
    private final String vin;

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

        this.make = make.length() >= 3 ? make : "Toyota";
        // if length of make is 3 or more, set make to toyota
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
        this.doors = doors >= 2 && doors <= 5 ? doors : 2;
        // If the number of doors is between 2 and 5 (inclusive), use that value; otherwise, default to 2
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats >=2 && seats <= 8 && seats != 3 ? seats : 2;
        // Use the given value if it's between 2 and 8 (inclusive), but not 3; otherwise, default to 2

    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels == 4 || wheels == 6 ? wheels : 4;
        // If the wheel count is 4 or 6, use that value; otherwise, default to 4
    }

    public Car(){
        vin = "ABC123";
    }

    public Car(String color, String make, String model){
        this.vin = "CMM3594752";
        setColor(color);
        setMake(make);
        setModel(model);
    }
    public Car(String color, String make, String model, int doors, int seats, int wheels) {
        setColor(color);
        setMake(make);
        setModel(model);
        setDoors(doors);
        setSeats(seats);
        setWheels(wheels);
        vin = "EFG987";
    }

    public Car(String color, String make, String model, int doors, int seats, int wheels, String vin) {
        setColor(color);
        setMake(make);
        setModel(model);
        setDoors(doors);
        setSeats(seats);
        setWheels(wheels);
        this.vin = vin;
    }

    public Car(String vin, int wheels, int seats, int doors, String model, String make, String color) {
        this(color, make, model, doors, seats, wheels, vin);
    }


}
