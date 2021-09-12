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
            if(i==1||i==21||i==31||i==41||i==51||i==61||i==71||i==81||i==91||i==101||i==121) {
                System.out.println("Накопленная сумма за" + " " + i + " " + "год составила: " + result1 + " " + "грн. ");

                System.out.println("Начисленные проценты в грн: " + result);

                System.out.println("-----------");
            }
            if(i>1&&i<5||i>21&&i<25||i>31&&i<35||i>41&&i<45||i>51&&i<55||i>61&&i<65||i>71&&i<75||i>81&&i<85||i>91&&i<95||i>101&&i<105||i>121&&i<125){
                System.out.println("Накопленная сумма за" + " " + i + " " + "года составила: " + result1 + " " + "грн. ");

                System.out.println("Начисленные проценты в грн: " + result);

                System.out.println("-----------");
            }
            else{
                if (i!= 1&&i!= 21&&i!= 31&&i!= 41&&i!= 51&&i!= 61&&i!= 71&&i!= 81&&i!= 91&&i!= 101&&i!= 121) {
                    System.out.println("Накопленная сумма за" + " " + i + " " + "лет составила: " + result1 + " " + "грн. ");

                    System.out.println("Начисленные проценты в грн: " + result);

                    System.out.println("-----------");
                }
            }
        }
    }

}
