import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Map<String, LinkedList<String>>map = new HashMap<>();
        int limit = 5;
        String student = "Jake";
        String przedmiot = "A16";

        File file = new File("/Users/szymondutka/Desktop/studiaRok2/javaLaby/lab13/zadanie1/src/students.txt");
        String line;

        try {
            Scanner s = new Scanner(file);
            while (s.hasNextLine()) {
                List<String> pomocnicza;
                line = s.nextLine();
                pomocnicza = List.of(line.split(" "));
                if(map.containsKey(pomocnicza.get(1))){
                    map.get(pomocnicza.get(1)).add(pomocnicza.get(0));
                }else{
                    map.put(pomocnicza.get(1), new LinkedList<>());
                    map.get(pomocnicza.get(1)).add(pomocnicza.get(0));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        map.forEach((k,v) ->{
            System.out.println(k + "\n" + v + "\n");
        });

        System.out.println("Liczba przedmiotow : " + numberOfClasses(map));
        System.out.println();
        System.out.println("Alfabetyczna lista studentow uczesczajacych na " + przedmiot + "\n" + studentsAttendingClass(przedmiot, map));
        System.out.println();
        System.out.println("Na " + bigClasses(limit, map) + " uczeszcza wiecej niz " + limit);
        System.out.println();
        System.out.println("lista przedmiotów na ktore uczescza wiecej niz limit(" + limit + ") studentow\n" + bigClassesList(limit, map));
        System.out.println();
        System.out.println("Liczba przedmiotow na jakie uczeszcza " + student + ": " + classNumber(student, map));
        System.out.println();
        System.out.println("Lista przedmiotow na jakie uczeszcza " + student + "\n" + classList("Jake", map));
    }

    private static int numberOfClasses(Map<String, LinkedList<String>> map){
        int liczbaPrzedmiotow = map.size();

        return liczbaPrzedmiotow;
    }

    private static LinkedList<String> studentsAttendingClass(String classCode, Map<String, LinkedList<String>> map){
        LinkedList<String> listaStudentow = map.get(classCode);

        listaStudentow.sort(String::compareTo);

        return listaStudentow;
    }

    private static int bigClasses(int limit, Map<String, LinkedList<String>> map){
        int iloscPrzedmiotow = 0;

            for (Map.Entry<String,LinkedList<String>> entry : map.entrySet()){
                if(entry.getValue().size() > limit){
                    iloscPrzedmiotow++;
                }
            }

        return iloscPrzedmiotow;
    }

    private static LinkedList<String> bigClassesList(int limit, Map<String, LinkedList<String>> map){
        LinkedList<String> listaPrzedmiotow = new LinkedList<>();

        for (Map.Entry<String,LinkedList<String>> entry : map.entrySet()){
            if(entry.getValue().size() > limit){
                listaPrzedmiotow.add(entry.getKey());
            }
        }

        return listaPrzedmiotow;
    }

    private static int classNumber(String student, Map<String, LinkedList<String>> map){
        int iloscPrzedmiotow = 0;

        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()){
            for(String e: entry.getValue()){
                if(e.equals(student)){
                    iloscPrzedmiotow++;
                }
            }
        }

        return iloscPrzedmiotow;
    }

    private static LinkedList<String> classList(String student, Map<String, LinkedList<String>> map){
        LinkedList<String> listaPrzedmiotow = new LinkedList<>();

        for (Map.Entry<String, LinkedList<String>> entry : map.entrySet()){
            for(String e: entry.getValue()){
                if(e.equals(student)){
                    listaPrzedmiotow.add(entry.getKey());
                }
            }
        }

        return listaPrzedmiotow;
    }
}