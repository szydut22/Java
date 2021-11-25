public class Main {

    public static void main(String[] args) {
	    Person[] people = new Person[4];//deklaracja tablicy obiektów klasy people

	    people[0] = new Person("Wojciech", "Kowalski", 20);//deklaracja pierwszej osoby
        people[1] = new Person("Jan", "Anus", 31);//deklaracja drugiej osoby
        people[2] = new Person("Oskar", "Andrus", 22);//deklaracja trzeciej osoby
        people[3] = new Person("Jan", "Jakistam", 22);//deklaracja trzeciej osoby

        //wypisywanie tablicy people przed sortowaniem
        System.out.println("Tablica osob przed sortowaniem");
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].toString());
        }
        System.out.println();

        Person.sort(people, new Comparator(){//posortowanie tablicy people
            @Override
            public int compareTo(Person a, Person b){//uzycie metody stworzonego interfejsu

//              int result = a.getFirstName().compareTo(b.getFirstName()); nie wiem czy mozna bylo tego uzyc poniewaz uzywane jest wtedy pare zewnetrznych bibliotek, result jest wynikiem porownania w tym wypadku dwoch imion w przeciwienstwie do lini 15 pozwala na porownanie i sortowanie wg. imion a nie dlugosci imion
                int result = a.getFirstName().length() - b.getFirstName().length();// sprawdzanie ktore imie jest dluzsze

                if(result != 0){//jezeli imiona beda sie roznic od siebie
                    return result;
                }

//                result = a.getLastName().compareTo(b.getLastName());nie wiem czy mozna bylo tego uzyc, result jest wynikiem porownania w tym wypadku dwoch nazwisk w przeciwienstwie do lini 21 pozwala na porownanie i sortowanie wg. nazwisk a nie dlugosci nazwisk

                //jezeli imiona beda takie same bedziemy patrzyc na nazwiska
                result = a.getLastName().length() - b.getLastName().length();// sprawdzanie ktore nazwisko jest dluzsze

                if(result != 0){//jezeli nazwiska beda sie roznic od siebie
                    return result;
                }

                //jezeli imiona i nazwiska beda takie same bedziemy patrzyc na wiek
                result = a.getAge() - b.getAge();//jezeli

                return result;
            }
        });

        System.out.println("Tablica osob po sortowaniu");
        //wypisywanie tablicy people po przesortowaniu
        for(int i = 0; i < people.length; i++){
            System.out.println(people[i].toString());
        }

    }
}
