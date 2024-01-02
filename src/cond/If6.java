package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount =+ 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
        } else if (age <= 10) {
            discount =+ 2000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }
        System.out.println("총 할인 금액: " + discount + "원");

        if (false) System.out.println("if문에서 실행됨");
        System.out.println("if문에서 실행안됨"); //한 줄만 실행할 경우 블럭없이 작성가능하지만 가독성이 안좋아질 수 있기 때문에 블럭있는게 좋다
    }
}
