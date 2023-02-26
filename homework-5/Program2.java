import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
// Отсортировать по убыванию популярности Имени.

public class Program2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        String text = "Иван Иванов " + "Светлана Петрова " +
                "Кристина Белова " + "Анна Мусина " +
                "Анна Крутова " + "Иван Юрин " +
                "Петр Лыков " + "Павел Чернов " +
                "Петр Чернышов " + "Мария Федорова " +
                "Марина Светлова " + "Мария Савина " +
                "Мария Рыкова " + "Марина Лугова " +
                "Анна Владимирова " + "Иван Мечников " +
                "Петр Петин " + "Иван Ежов ";
        
        String[] namesAndSurnames = text.split(" ");
        for (int i = 0; i < namesAndSurnames.length; i += 2) {
            if (map.containsKey(namesAndSurnames[i])) {
                map.replace(namesAndSurnames[i], map.get(namesAndSurnames[i]) + 1);
            } else {
                map.put(namesAndSurnames[i], 1);
            }
        }
        System.out.println(map);

        Map<String, Integer> mapSorted = new LinkedHashMap<>();
        int max = 1;
        for (int value : map.values()) {
            if (value > max) {
                max = value;
            }
        }
        for (int i = max; i > 0; i--) {
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (map.get(entry.getKey()) == i) {
                    mapSorted.put(entry.getKey(), map.get(entry.getKey()));
                }
            }
        }
        System.out.println(mapSorted);
    }
}
