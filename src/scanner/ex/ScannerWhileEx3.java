package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        //int num = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
        while (true) {
            int num = input.nextInt();

            if (num == -1) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += num;
            count++;
        }
/*        while ((num = input.nextInt()) != -1) {
            sum += num;
            count++;
        }*/

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
