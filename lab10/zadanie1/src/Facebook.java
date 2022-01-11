public class Facebook extends Network{
    public Facebook(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        if(super.getUserName().equals(userName) && super.getPassword().equals(password)){
            System.out.println("Zalogowano poprawnie");
            System.out.println("Witamy w Facebooku " + super.getUserName() + ", dzisiejsza data: ");
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

    }

}
