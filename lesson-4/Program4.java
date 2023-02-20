import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Program4 {
    public static void main(String[] args) {
        String[] arr = new String[]{"hi", "welcome", "java", "task"};
        Queue<String> q = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q.add(arr[i]);
        }
        while(!q.isEmpty()) {
            System.out.print(q.remove() + " ");
        }

        System.out.println();

        Deque<String> dq = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            dq.addFirst(arr[i]);
        }
        while(!dq.isEmpty()) {
            System.out.print(dq.removeFirst() + " ");
        }
    }
}
