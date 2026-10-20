
import java.util.Scanner;
import java.util.Arrays; 

public class Main {
    public static void main(String[] args) {

        
        int[] numbers = {8, 2, 3, 6, 9};

        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Текущий массив: " + Arrays.toString(numbers));
        System.out.print("Выберите действие: ");
        System.out.print("Добавить число - 1 или ");
        System.out.println(" Удалить число - 2 ");

        int pick = scanner.nextInt();

        if (pick == 1) {
            System.out.print("Напишите какое число добавить: ");
            int newNum = scanner.nextInt();
            
           
            int[] newNumbers = new int[numbers.length + 1];
            
         
            for (int i = 0; i < numbers.length; i++) {
                newNumbers[i] = numbers[i];
            }
          
            newNumbers[newNumbers.length - 1] = newNum;
            numbers = newNumbers; 

            System.out.println("Новый массив: " + Arrays.toString(numbers));
            
        } else if (pick == 2) {
            System.out.print("Напишите индекс числа для удаления: ");
            int delNum = scanner.nextInt();

            
            if (delNum < 0 || delNum >= numbers.length) {
                System.out.println("Ошибка: индекс выходит за границы массива");
            } else {
                
                int[] newNumbers = new int[numbers.length - 1];
                int index = 0;
                
            
                for (int i = 0; i < numbers.length; i++) {
                    if (i != delNum) {
                        newNumbers[index] = numbers[i];
                        index++;
                    }
                }
                numbers = newNumbers;
                
                System.out.println("Новый массив: " + Arrays.toString(numbers));
            }
        } else {
            System.out.println("Неверный выбор. Выберите 1 или 2");
        }
    }
}

