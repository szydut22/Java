public class Twitter extends Network{
    public Twitter(String userName, String password) {
        super(userName, password);
    }

    @Override
    boolean logIn(String userName, String password) {
        if(super.getUserName().equals(userName) && super.getPassword().equals(password)){
            System.out.println("Zalogowano poprawnie");
            System.out.println("Witamy w Twitterze " + super.getUserName());
            return true;
        }
        System.out.println("Podany zly login lub haslo");
        return false;
    }

    @Override
    void logOut() {
        System.out.println("Wylogowany");
    }

    @Override
    void sendData(String data) {

    }
}
