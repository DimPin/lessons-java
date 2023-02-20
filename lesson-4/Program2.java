import java.util.LinkedList;
import java.util.Scanner;

/* Реализовать консольное приложение, которое:

1. Принимает от пользователя строку вида

add~text

1. add~text - сохранить text в связный список.
2. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
*/

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        while(true){
            String[] text = sc.nextLine().split("⁓");
            System.out.println(text);
            if(text[0].equals("add")){
                addText(text[1], list);
                System.out.println(list.toString());
            } else if(text[0].equals("print")){
                del(Integer.parseInt(text[1]), list);
            } else {
                System.out.println("Error");
            }
        }

    }

    public static void addText(String text, LinkedList<String> list){
        list.add(text);
    }

    public static void del(int num, LinkedList<String> list){
        System.out.println(list.remove(num));
    }
}