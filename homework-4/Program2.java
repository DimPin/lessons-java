import java.util.ArrayDeque;
import java.util.Random;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class Program2 {
    public static ArrayDeque<Integer> enqueue(ArrayDeque<Integer> arrayDeque, int element) {
        arrayDeque.addLast(element);
        return arrayDeque;
    }

    public static int dequeue(ArrayDeque<Integer> arrayDeque) {
        int first = arrayDeque.getFirst();
        arrayDeque.pollFirst();
        return first;
    }

    public static int first(ArrayDeque<Integer> arrayDeque) {
        return arrayDeque.getFirst();
    }

    public static void main(String[] args) {
        Random random = new Random();
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        for (int i = 0; i <= 10; i++) {
            arrayDeque.add(random.nextInt(0, 10));
        }

        int element = 10;
        System.out.println(arrayDeque);
        System.out.println(enqueue(arrayDeque, element));
        System.out.println(dequeue(arrayDeque));
        System.out.println(arrayDeque);
        System.out.println(first(arrayDeque));
    }
}
