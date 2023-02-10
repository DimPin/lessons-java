// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)

// 2. Вывести все простые числа от 1 до 1000

// 3. Реализовать простой калькулятор (+ - / *)

public class program {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(triangleNumber(n));
        System.out.println();
        System.out.println(FactorialNumber(n));
        System.out.println();
        allDigits(1, 1000);
        System.out.println();
        calc(5, 8, "*");
    }

    public static int triangleNumber(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static int FactorialNumber(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void allDigits(int n1, int n2) {
        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        }
    }

    public static void calc(int num1, int num2, String oparation) {
        if (oparation == "+") {
            System.out.println(num1 + num2);
        } else if (oparation == "-") {
            System.out.println(num1 - num2);
        } else if (oparation == "*") {
            System.out.println(num1 * num2);
        } else if (oparation == "/") {
            System.out.println(num1 / num2);
        }
    }
}
