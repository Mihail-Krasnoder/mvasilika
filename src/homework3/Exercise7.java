package homework3;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the X:" );
        int x = in.nextInt();
        for (int i = 0; i <= 10; i++) {
            int result = x * i;
            System.out.println(x + " * " + i + " = " + result);
        }
    }
}
