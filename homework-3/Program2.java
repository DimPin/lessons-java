import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. 
// из этого списка

public class Program2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        
        int min = 0;
        int max = 0;
        int sumArith = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(min) >= list.get(i)) {
                min = i;
            }
            if (list.get(max) <= list.get(i)) {
                max = i;
            }
            sumArith += list.get(i);
        }
        System.out.println(list.get(min) + ", " + list.get(max) + ", " + sumArith / list.size());
    }
}
