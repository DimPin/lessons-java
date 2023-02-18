import java.util.logging.*;
import java.io.IOException;
import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), результат после каждой 
// итерации запишите в лог-файл.

public class Program1 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(Program1.class.getName());

        String path = "logs.txt";

        FileHandler FH = new FileHandler(path);
        logger.addHandler(FH);

        SimpleFormatter formatter = new SimpleFormatter();
        FH.setFormatter(formatter);

        int[] array = new int[] {9, 3, 5, 10, 12, 8};
        System.out.println(Arrays.toString(array));

        Sorting(array, logger);
        System.out.println(Arrays.toString(array));
    }

    public static void Sorting(int[] arr, Logger logger) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    logger.info(Arrays.toString(arr));
                }
            }
        }
    }
}