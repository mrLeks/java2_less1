package lesson3;


import java.util.HashMap;

//Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
public class less3 {
    public static void main(String[] args){
        String[] basketTeam = {"Lakers", "Grizzlies", "Bulls", "Lakers",
                "CSKA", "Bulls", "Warriors", "Spurs", "Lakers", "Rockets"};
        HashMap<String, Integer> team = new HashMap<>();
        for(String x : basketTeam){
            team.put(x, team.getOrDefault(x,0)+1);
        }

        System.out.println(team);

        System.out.println("============================");

        phonebook book = new phonebook();
        book.add("Петрова","8912421");
        book.add("Александров","8343322");
        book.add("Сидорова","8876712");
        book.add("Иванов","8912421");
        book.add("Александров","811111111");
        book.add("Петрова","8777777");

        book.get("Петрова");
        book.get("Иванов");
        book.get("Александров");
    }
}
