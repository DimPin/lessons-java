import java.util.ArrayList;
import java.util.LinkedList;

// 1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. Сравните с предыдущим.

public class Program1 {
    public static void main(String[] args) {
        ArrayList<Integer> arList = new ArrayList<>();
        Long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arList.add(0, i);
        }
        Long time1 = System.currentTimeMillis();
        System.out.println(time1 - time);

        LinkedList<Integer> linList = new LinkedList<>();
        Long time2 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linList.add(0, i);
        }
        Long time3 = System.currentTimeMillis();
        System.out.println(time3 - time2);
    }
}
