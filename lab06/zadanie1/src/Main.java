public class Main {

   public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("audi", "red", "Q7", 2021); //stworzenie obiektu klasy Vehicle
        Car car = new Car("Renault", "grey", "Koleos",2020, "SUV"); //stworzenie obiektu klasy Car

       System.out.println(vehicle);
       System.out.println(car);
   }
}
