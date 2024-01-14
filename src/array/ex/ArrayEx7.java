package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        int[][] score = new int[4][3];
        Scanner scanner = new Scanner(System.in);
        String[] subjects = {"국어", "영어", "수학"};

        for (int student = 0; student < score.length; student++){
            System.out.println((student+1) + "번 학생의 성적을 입력하세요:");
            for (int subject = 0; subject < score[student].length; subject++) {
                System.out.print(subjects[subject] + " 점수: ");
                score[student][subject] = scanner.nextInt();
            }
        }

        for (int student = 0; student < score.length; student++){
            int sum = 0;
            for (int subject = 0; subject < score[student].length; subject++) {
                sum += score[student][subject];
            }
            double avg = (double) sum / score[student].length;
            System.out.println((student+1) + "번 학생의 총점: " + sum + " ,평균: " + avg);
        }
    }
}
