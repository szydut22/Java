public class Vehicle {
    private String make;
    private String color;
    private String model;
    private int year;

    public Vehicle(String make, String color, String model, int year) {//konstruktor inicjalizujacy dane
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public String toString(){//funkcja toString() ktora odpowiada za wypisanie danych
        return String.format("make: %s\ncolor: %s\nmodel: %s\nyear: %d\n", make, color, model, year);
    }
}