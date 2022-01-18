import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Logowanie do Facebooka: ");
        Facebook Facebook = new Facebook("Szymon", "ala123");//tworzenie obiektu klasy Facebook ktora dziedziczy po klasie Network, podaje mu na wejscie ustalone wczesniej haslo i login
        Facebook.post("facebook");//wywolanie metody obiektu

        System.out.println();

        System.out.println("Logowanie do Twittera: ");
        Twitter Twitter = new Twitter("Andrzej", "haslo1234");
        Twitter.post("twitter");
    }
}
