
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(8);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);
        numbers.add(9);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Текущий массив" + numbers);
        System.out.print("Выберите действие: ");
        System.out.print( "Добавить число - 1 или ");
        System.out.println(" Удалить число - 2 ");

        int pick = scanner.nextInt();

        if (pick == 1) {
            System.out.print("Напишите какое число добавить: ");
            int newNum = scanner.nextInt();
            numbers.add(newNum);
            System.out.println("Новый массив: " + numbers);
        } else if (pick == 2) {
            System.out.print("Напишите индекс числа для удаления: ");
            int delNum = scanner.nextInt();

            if (delNum < 0 || delNum >= numbers.size()) {
                System.out.println("Ошибка: индекс выходит за границы массива");
            } else {
                numbers.remove(delNum);
                System.out.println("Новый массив: " + numbers);
            }
        } else {
            System.out.println("Неверный выбор. Выберите 1 или 2");
        }

    }
}
