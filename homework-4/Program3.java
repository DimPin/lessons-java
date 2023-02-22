import java.util.Scanner;

// В калькулятор добавьте возможность отменить последнюю операцию.

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.print("Введите число: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.print("Введите операцию: ");
        String operation = sc.nextLine();
        int res = 0;
        int last_res = 0;
        switch (operation) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        System.out.println(res);
        while (true) {
            last_res = res;
            System.out.print("Введите число: ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.print("Введите операцию: ");
            operation = sc.nextLine();
            switch (operation) {
                case "+":
                    res += num;
                    break;
                case "-":
                    res -= num;
                    break;
                case "*":
                    res *= num;
                    break;
                case "/":
                    res /= num;
                    break;
            }
            System.out.println(res);

            System.out.print("Отмена предидущей операции? 1/0: ");
            int cancell = Integer.parseInt(sc.nextLine());
            if (cancell == 1) {
                res = last_res;
                System.out.println(res);
            }
        }
    }
}
