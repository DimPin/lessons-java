import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь 
// несколько телефонов.
// Добавить функции
// 1) Добавление номера
// 2) Вывод всего

public class Program1 {
    public static void main(String[] args) {
        Map<String, int[]> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите 1 - добавить номер, 2 - вывод всех номеров, 3 - выход из программы: ");
            int addOrPrint = sc.nextInt();
            if (addOrPrint == 1) {
                System.out.print("Введите фамилию: ");
                String surname = sc.next();
                System.out.print("Введите количество номеров телефона: ");
                int size = sc.nextInt();
                int[] numbers = new int[size];
                for (int i = 0; i < size; i++) {
                    System.out.print("Введите номер: ");
                    int number = sc.nextInt();
                    numbers[i] = number;
                }
                map.put(surname, numbers);
            } else if (addOrPrint == 2) {
                for (var element : map.entrySet()) {
                    System.out.println(element.getKey() + "-" + Arrays.toString(element.getValue()));
                }
            } else {
                for (var element : map.entrySet()) {
                    System.out.println(element.getKey() + "-" + Arrays.toString(element.getValue()));
                }
                sc.close();
                break;
            }
        }
    }
}
