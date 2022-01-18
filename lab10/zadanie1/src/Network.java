import java.util.Scanner;

public abstract class Network {//klasa abstrakcyjna
    private final String userName;
    private final String password;
    Scanner s = new Scanner(System.in);

    public Network(String userName, String password) {//konstruktor inicjalizujacy
        this.userName = userName;
        this.password = password;
    }

    //metody abstrakcyjne
    abstract boolean logIn(String userName, String password);
    abstract void logOut();
    abstract void sendData(String data);

    public void post(String message) {//za message dostaje nazwe portalu do ktorego sie loguje
        //prosze uzytkownika o podanie hasla i loginu, przekazujac je pozniej do funkcji logIn ktora sprawdza poprawnosc wprowadzonych danych z danymi wprowadzonymi w mainie
        System.out.print("Login: ");
        String login = s.nextLine();
        System.out.print("Haslo: ");
        String haslo = s.nextLine();
        if(logIn(login, haslo)){
            sendData(message);
            logOut();
        }
    }

    //gettery ktore maja na celu pobranie danych takich jak login czy haslo, uzywane sa w klasach facebook i twitter
    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
