public class Car extends Vehicle{ //klasa car dziedziczaca z klasy Vehicle
    private String bodyStyle;

    public Car(String make, String color, String model, int year, String bodyStyle) {
        super(make, color, model, year); //odwołanie do konstruktora klasy nadrzędnej w tym wypadku do klasy Vehicle
        this.bodyStyle = bodyStyle;
    }

    public String toString(){//funkcja toString() wypisujaca przekazane jej dane
        return String.format(super.toString() + "bodystyle: " + bodyStyle);
    }
}
