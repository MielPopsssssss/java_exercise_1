import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Bienvenue !");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if (str.equals("quit")){
            return;
        }
        else{
            System.out.println("Unknown command");
        }
        scanner.close();
    }
}