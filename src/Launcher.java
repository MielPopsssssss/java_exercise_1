import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        while (!str.equals("quit")){
            System.out.println("Unknown command");
            scanner = new Scanner(System.in);
            str = scanner.nextLine();
        }
        return;
    }
}