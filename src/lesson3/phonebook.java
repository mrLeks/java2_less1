package lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class phonebook {
    HashMap<String, HashSet<String>> pb = new HashMap<>();
    public void add(String name, String number){
        HashSet<String> book = pb.getOrDefault(name, new HashSet<>());
        book.add(number);
        pb.put(name, book);
    }

    public void get(String name){
        System.out.println(name + "/Номер телефона: " + pb.getOrDefault(name, new HashSet<>()));
    }
}
