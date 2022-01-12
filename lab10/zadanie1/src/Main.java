import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Logowanie do Facebooka: ");
        Facebook Facebook = new Facebook("Szymon", "ala123");
        Facebook.post("facebook");

        System.out.println();

        System.out.println("Logowanie do Twittera: ");
        Twitter Twitter = new Twitter("Andrzej", "haslo1234");
        Twitter.post("twitter");
    }
}
