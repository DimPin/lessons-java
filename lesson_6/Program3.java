package lesson_6;

import java.util.Arrays;
import java.util.TreeSet;

// 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.

public class Program3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 1000, 3000, 2, 400000000, 5, 6000000, 3));
        System.out.println(treeSet);
    }    
}
