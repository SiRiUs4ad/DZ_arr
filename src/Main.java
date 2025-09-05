import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        //*1)** Сумма и среднее массива Ввод: `n`, затем `n` целых. Вывести: сумму и среднее (с 2 знаками после запятой).
        /*System.out.println("Enter count: ");
        int count = scanner.nextInt();
        double sum = 0.0;
        double[] array = new double[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter number: ");
            array[i] = scanner.nextDouble();
            sum += array[i];
        }
        System.out.printf("Sum: %.2f Average: %.2f", sum, (sum / count));*/


        //2)** Минимум, максимум и их индексы Ввод: `n`, затем `n` целых. Вывести: значения `min` и `max`,
        // а также наименьшие индексы их вхождений.

        /*System.out.println("Enter count: ");
        int count = scanner.nextInt();
        int max = 0, min = 100, maxi = 0, mini = 0;

        int[] array = new int[count];

        for (int i = 0; i < count; i++) {
            array[i] = rnd.nextInt(100);
            int num = array[i];
            if (num > max) {
                max = num;
                maxi = i;
            }
            if (num < min) {
                min = num;
                mini = i;
            }
        }
        System.out.println("Min: " + min + " index: " + mini);
        System.out.println("Max: " + max + " index: " + maxi);*/


        //3)** Подсчёт положительных/отрицательных/нулей Ввод: `n`, затем `n` целых.
        // Вывести: три числа — сколько `>0`, `<0` и `==0`.
        /*System.out.println("enter count: ");
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int a = 0, b = 0, c = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("enter num: ");
            arr[i] = scanner.nextInt();
            if (arr[i] > 0) a++;
            if (arr[i] < 0) b++;
            if (arr[i] == 0) c++;
        }
        System.out.printf("quantity >0: %d, quantity <0: %d, quantity ==0: %d", a, b, c);*/
    }
}