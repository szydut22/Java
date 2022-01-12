import java.util.Scanner;

public abstract class Network {
    private final String userName;
    private final String password;
    Scanner s = new Scanner(System.in);

    public Network(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    abstract boolean logIn(String userName, String password);
    abstract void logOut();
    abstract void sendData(String data);

    public void post(String message) {//za message dostaje nazwe podklasy do ktorej sie loguje w danej chwili
        System.out.print("Login: ");
        String login = s.nextLine();
        System.out.print("Haslo: ");
        String haslo = s.nextLine();
        if(logIn(login, haslo)){
            sendData(message);
            logOut();
        }
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
