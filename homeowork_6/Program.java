package homeowork_6;

import java.util.Scanner;

// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. 
// Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, 
// отвечающие фильтру. Критерии фильтрации можно хранить в Map. минимум 5 
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook 
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить критерии - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// Пример: ----->

// приветствие

// Выбор параметра:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет
// выбор конкретнее
// 1 ---> Введите колво ---> 16
// вывод всех подходящих ноутбуков по параметру

public class Program {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(8, 512, "Windows", "white");
        Laptop laptop2 = new Laptop(16, 1024, "Mac", "gray");
        Laptop laptop3 = new Laptop(32, 2048, "Windows", "black");
        Laptop laptop4 = new Laptop(8, 256, "Mac", "gray");
        Laptop laptop5 = new Laptop(16, 512, "Mac", "blue");

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1 - ОЗУ, 2 - ЖД, 3 - ОС, 4 - цвет: ");
        int data = sc.nextInt();

        if (data == 1) {
            System.out.print("Введите объём ОЗУ (8, 16, 32): ");
            int memory = sc.nextInt();
            String result = "";
            if (laptop1.getRAM() == memory) {
                result += "Laptop1 ";
            }
            if (laptop2.getRAM() == memory) {
                result += "Laptop2 ";
            }
            if (laptop3.getRAM() == memory) {
                result += "Laptop3 ";
            }
            if (laptop4.getRAM() == memory) {
                result += "Laptop4 ";
            }
            if (laptop5.getRAM() == memory) {
                result += "Laptop5 ";
            }
            if (result == "") {
                result += "Ничего не нашлось";
            }
            System.out.println(result);
        } else if (data == 2) {
            System.out.print("Введите объём ЖД (256, 512, 1024, 2048): ");
            int memory = sc.nextInt();
            String result = "";
            if (laptop1.getHD() == memory) {
                result += "Laptop1 ";
            }
            if (laptop2.getHD() == memory) {
                result += "Laptop2 ";
            }
            if (laptop3.getHD() == memory) {
                result += "Laptop3 ";
            }
            if (laptop4.getHD() == memory) {
                result += "Laptop4 ";
            }
            if (laptop5.getHD() == memory) {
                result += "Laptop5 ";
            }
            if (result == "") {
                result += "Ничего не нашлось";
            }
            System.out.println(result);
        } else if (data == 3) {
            System.out.print("Введите ОС (Windows, Mac): ");
            String OS = sc.next();
            String result = "";
            if (laptop1.getOS().equals(OS)) {
                result += "Laptop1 ";
            }
            if (laptop2.getOS().equals(OS)) {
                result += "Laptop2 ";
            }
            if (laptop3.getOS().equals(OS)) {
                result += "Laptop3 ";
            }
            if (laptop4.getOS().equals(OS)) {
                result += "Laptop4 ";
            }
            if (laptop5.getOS().equals(OS)) {
                result += "Laptop5 ";
            }
            if (result == "") {
                result += "Ничего не нашлось";
            }
            System.out.println(result);
        } else if (data == 4) {
            System.out.print("Введите цвет (white, black, gray, blue): ");
            String color = sc.next();
            String result = "";
            if (laptop1.getColor().equals(color)) {
                result += "Laptop1 ";
            }
            if (laptop2.getColor().equals(color)) {
                result += "Laptop2 ";
            }
            if (laptop3.getColor().equals(color)) {
                result += "Laptop3 ";
            }
            if (laptop4.getColor().equals(color)) {
                result += "Laptop4 ";
            }
            if (laptop5.getColor().equals(color)) {
                result += "Laptop5 ";
            }
            if (result == "") {
                result += "Ничего не нашлось";
            }
            System.out.println(result);
        } else {
            System.out.println("Что-то не так, попробуйте ещё");
        }
        sc.close();
    }
}
