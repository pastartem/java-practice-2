import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int zagadnum = random.nextInt(100) + 1;

        int Attempts = 0;
        int maxAttempts = 10;
        boolean ygadnum = false;

        System.out.println("Число от 1 до 100 загадано. Всего есть 10 попыток");

        while (Attempts < maxAttempts) {
            System.out.print("Напишите предполагаемое число: ");
            int guess = scanner.nextInt();

            if (guess < 1 || guess > 100) {
                System.out.println("Число не может быть меньше 1 и больше 100");
                continue;
            }

            Attempts++;

            if (guess > zagadnum) {
                System.out.println("Загаданное число меньше");
                System.out.println("Сделано " + Attempts + " попыток ");
            } else if (guess < zagadnum) {
                System.out.println("Загаданное число больше");
                System.out.println("Сделано " + Attempts + " попыток ");
            } else {
                System.out.println("Поздравляю, вы угадали число за " + Attempts + " попыток");
                ygadnum = true;
                return;
            }
        }


        if (!ygadnum) {
            System.out.println("Вы проиграли! Закончились попытки. Загаданное число было: " + zagadnum);
        }


    }
}