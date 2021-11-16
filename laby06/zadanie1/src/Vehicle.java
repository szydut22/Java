public class Vehicle {
    private String make;
    private String color;
    private String model;
    private int year;

    public Vehicle(String make, String color, String model, int year) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String toString(){
        return String.format("make = %s\ncolor = %s\nmodel = %s\nyear = i\n", make, color, model, year);
    }
}