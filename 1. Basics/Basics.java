import java.util.Scanner;

public class Basics{
    public static void main(String[] args) {
        
        //1. User Input Output
        System.out.println("Hello World");

        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        System.out.println(n);
        scanner.close();
    }
}