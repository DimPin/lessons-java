// Напишите метод, который принимает на вход строку (String) и определяет является ли строка 
// палиндромом (возвращает boolean значение).  

public class Program3 {  
    public static void main(String[] args) {
        String input = "абба";
        System.out.println(input);
        System.out.println(isPalindrome(input));
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
