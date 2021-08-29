package homework3;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        int result = 1;
        while (result<100) {
            System.out.println(result);
            result++;
        }
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:" );
        int n = in.nextInt();
        int a = 1;
        int i = 1;
        while (i<=n) {
            a = a * i;
            i++;
        }
        System.out.println("n! = " + a);
    }
}
