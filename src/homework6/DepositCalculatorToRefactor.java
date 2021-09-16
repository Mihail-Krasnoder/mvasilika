package homework6;

import java.util.Scanner;

public class DepositCalculatorToRefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сумму вклада в банк в гривнах: ");

        double sum = sc.nextDouble();

        System.out.print("Какой процент годовых? ");

        double percent = sc.nextDouble();

        System.out.print("Длительность вклада (лет): ");

        int term = sc.nextInt();

        System.out.println(" ");

        for (int i = 1; i <= term; i++) {
            double y = sum / 100 * percent;
            sum = sum + y;
            String yearWord = "";
            if(i % 10 == 1){
                yearWord = "год";
            }
            else if(i % 10 > 1 && i % 10 < 5){
                if(i % 100 > 10 && i % 100 < 15){
                    yearWord = "лет";
                }
                else yearWord = "года";
            }
            else {
                yearWord = "лет";
            }
            System.out.printf("Накопленная сумма за %d %s составила: %.2f грн\n", i, yearWord, sum);
            System.out.printf("Начисленные проценты в грн: %.2f\n", y);
            System.out.println("--------");
        }
    }
}
