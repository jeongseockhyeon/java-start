package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        System.out.println("출력");
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
