import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет 
// “перевернутый” список.

public class Program1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i <= 10; i++) {
            linkedList.add(i);
        }
        System.out.println(linkedList);
        System.out.println(reverse(linkedList));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> linkedList) {
        LinkedList<Integer> newlinkedList = new LinkedList<>();
        for (int i = linkedList.size()-1; i >= 0; i--) {
            newlinkedList.add(linkedList.get(i));
        }
        return newlinkedList;
    }
}
