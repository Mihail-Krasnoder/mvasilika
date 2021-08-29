package homework3;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        int result = 1;
        do{
            System.out.println(result);
            result++;
        }
        while(result<100);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:" );
        int n = in.nextInt();
        int a = 1;
        int i = 1;
        do  {
            a = a * i;
            i++;
        }
        while (i<=n);
        System.out.println("n! = " + a);
    }
}
