import java.util.Scanner;

public class Launcher {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("quit")){
            if (str.equals("fibo")){
                Scanner number = new Scanner(System.in);
                System.out.println(fibonacci(Integer.parseInt(number.nextLine())));
            }
            if (!str.equals("fibo") && !str.equals("quit")) {
                System.out.println("Unknown command");
            }
            scanner = new Scanner(System.in);
            str = scanner.nextLine();
        }
        return;
    }
}