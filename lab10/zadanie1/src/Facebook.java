public class Facebook extends Network{//klasa dziedziczaca po klasie abtrakcyjnej Network
    public Facebook(String userName, String password) { //konstruktor inicjalizujacy dane
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {//metoda logowania
        if(super.getUserName().equals(userName) && super.getPassword().equals(password)){//sprawdzam czy wprowadzone przez nas haslo i login sa zgodne z tymi wprowadzonymi poprzez klase Network
            System.out.println("Zalogowano poprawnie");
            System.out.println("Witamy " + super.getUserName());
            return true;
        }
        System.out.println("Podano zly login lub haslo");
        return false;
    }

    @Override
    void logOut() {
        System.out.println("Wylogowuje...");
    }

    @Override
    void sendData(String data) {
        System.out.println(data);
    }

}
