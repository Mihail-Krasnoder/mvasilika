package homework2;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму денежного вклада:");
        long money = scanner.nextInt() * 100;
        System.out.println("Введите процент годовых:");
        int p = scanner.nextInt();
        System.out.println("Введите длительность вклада:");
        int years = scanner.nextInt();
        for (int i = 0; i < years; i++) {
            long h = money * p / 100;
            money += h;
        }

        System.out.println(money / 100.0);
    }
}
