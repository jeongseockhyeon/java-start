package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max;
        int min;
        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int index = input.nextInt();

        int[] numbers = new int[index];

        System.out.println(index + "개의 정수를 입력하세요");
        for (int i = 0; i < index; i++) {
            numbers[i] = input.nextInt();
        }

        max = numbers[0];
        min = numbers[0];
        for (int number : numbers) {
            max = max < number ? number : max;
            min = min > number ? number : min;
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
