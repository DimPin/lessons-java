import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.

// 123456 Иванов

// 321456 Васильев

// 234561 Петрова

// 234432 Иванов

// 654321 Петрова

// 345678 Иванов

// Вывести данные по сотрудникам с фамилией Иванов.

public class Program1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите фамилию или q для выхода: ");
            String surname = sc.next();
            if (surname.equals("q")) {
                sc.close();
                break;
            }
            System.out.print("Введите номер паспорта: ");
            int number = sc.nextInt();
            map.put(number, surname);
            System.out.println(map);
        }
        for (var element : map.entrySet()) {
            if (element.getValue().equals("Иванов")) {
                System.out.println(element.getKey() + " " + element.getValue());
            }
        }
    }
}
