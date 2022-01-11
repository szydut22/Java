import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String login;
        String haslo;
        Scanner s = new Scanner(System.in);

        System.out.println("Gdzie chcesz sie zalogowac");
        System.out.println("Facebook");
        System.out.println("Twitter");
        System.out.print("Gdzie chcesz sie zalogowac: ");
        System.out.println();
        
        switch(s.nextLine()){
            case "Facebook":
                System.out.print("Login: ");
                login = s.nextLine();
                System.out.print("Haslo: ");
                haslo = s.nextLine();

                Network Facebook = new Facebook("Szymon", "ala123");
                if(Facebook.logIn(login, haslo)){
                    Facebook.logOut();
                }
                break;
            case "Twitter":
                System.out.print("Login: ");
                login = s.nextLine();
                System.out.print("Haslo: ");
                haslo = s.nextLine();

                Network Twitter = new Twitter("Andrzej","123ala");
                if(Twitter.logIn(login, haslo)){
                    Twitter.logOut();
                }
                break;
        }
    }
}
