import java.util.ArrayList;
import java.util.Random;

// Заполнить список десятью случайными числами. 
// Отсортировать список методом sort() и вывести 
// его на экран.

// Заполнить список названиями планет Солнечной 
// системы в произвольном порядке с повторениями. 
// Вывести название каждой планеты и количество его 
// повторений в списке.

// Создать список типа ArrayList. Поместить в него как строки, 
// так и целые числа. Пройти по списку, найти и удалить целые 
// числа.

public class Program {
    public static void main(String[] args) {
        randomArray();
        System.out.println();
        Planets();
        System.out.println();
        stringAndNumbers();
    }

    public static void stringAndNumbers() {
        ArrayList list = new ArrayList<>();
        list.add(1);
        list.add("hello");
        list.add(2);
        list.add("hi");
        list.add("a");
        list.add(1);
        list.add(6);
        list.add(1);
        list.add("bye");
        list.add(1);
        list.add(1);

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }

    public static void Planets() {
        ArrayList<String> WordsArr = new ArrayList<>();
        WordsArr.add("Земля");
        WordsArr.add("Венера");
        WordsArr.add("Марс");
        WordsArr.add("Юпитер");
        WordsArr.add("Уран");
        WordsArr.add("Земля");
        WordsArr.add("Земля");
        WordsArr.add("Венера");
        WordsArr.add("Венера");
        WordsArr.add("Юпитер");
        WordsArr.add("Юпитер");
        WordsArr.add("Уран");
        WordsArr.add("Уран");
        WordsArr.add("Уран");
        WordsArr.add("Уран");

        int counter = 1;
        WordsArr.sort(null);

        for(int i = 1; i < WordsArr.size(); i++) {
            if(WordsArr.get(i).equals(WordsArr.get(i-1))) {
                counter++;
            } else {
                System.out.println(WordsArr.get(i-1) + ": " + counter);
                counter = 1;
            }
        }
        System.out.println(WordsArr.get(WordsArr.size()-1) + ": " + counter);
    }

    public static void randomArray() {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));
            System.out.print(list.get(i) + " ");
        }
        list.sort(null);
        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
