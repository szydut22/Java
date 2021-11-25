public class Person{
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {//konstruktor inicjalizujacy imie, nazwisko, wiek
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public static void sort(Person[] array, Comparator comp){ //funkcja sortujaca tablice people
        boolean changed = true;
        for(int i = 0; i < array.length && changed; i++) {//petla iteruje sie do wielkosci tablicy people oraz changed
            changed = false;
            for(int j = 0; j < array.length - i - 1; j++){
                if(comp.compareTo(array[j], array[j+1]) > 0){//jezeli wynik porownywania jest wiekszy od 0 wtedy wykona sie podmiana indexow porownywanych osob
                    Person tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    changed = true;
                }
            }
        }
    }
    public String toString(){//funckja toString wypisujaca dane
        return String.format("Imie = %s, Nazwisko = %s, wiek = %d", firstName, lastName, age);
    }
}
