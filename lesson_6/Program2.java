package lesson_6;

import java.util.Arrays;
import java.util.LinkedHashSet;

// 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  
// Распечатайте содержимое данного множества.

public class Program2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(Arrays.asList(1, 1000, 3000, 2, 4, 5, 6, 3));
        System.out.println(hashSet);
    }    
}
