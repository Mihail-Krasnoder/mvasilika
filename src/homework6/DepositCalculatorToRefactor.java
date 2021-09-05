package homework6;

import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада в банк в гривнах: ");

        double sum = sc.nextDouble();

        System.out.print("Какой процент годовых? ");

        double percent = sc.nextDouble();

        System.out.print("Длительность вклада (лет): ");

        int term = sc.nextInt();

        System.out.println();

        for (int i = 1; i <= term; i++)
        {
            double y = sum / 100 * percent;

            sum = sum + y;
            String result1 = String.format("%.2f",sum);
            String result = String.format("%.2f",y);
            System.out.println("Накопленная сумма за" + " " + i + " " + "год составила: " + result1 + " " + "грн. ");

            System.out.println("Начисленные проценты в грн: " + result);

            System.out.println("-----------");
        }
    }

}
