public class Car extends Vehicle{
    private String bodyStyle;

    public Car(String make, String color, String model, int year, String bodyStyle) {
        super(make, color, model, year);
        this.bodyStyle = bodyStyle;
    }

    public String toString(){
        return String.format(super.toString() + "bodystyle = " + bodyStyle);
    }
}
