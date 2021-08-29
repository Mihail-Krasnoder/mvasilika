package homework3;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: " );
        int a = in.nextInt();
        System.out.println("Enter the degree of the number: " );
        int b = in.nextInt();
        System.out.println("Число 5 в квадрате равно " + (int)Math.pow(a, b));
    }
}
