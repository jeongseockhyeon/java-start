package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxCount = 10;
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[maxCount];
        int[] productPrices = new int[maxCount];
        int productCount = 0;

        while (true) {
            System.out.println("1.상품 등록 2.상품 목록 3.종료");
            System.out.print("메뉴를 선택하세요: ");

            int option = scanner.nextInt();
            scanner.nextLine();
            if (option == 1) {
                if (productCount >= maxCount) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다");
                    continue;
                }

                System.out.print("등록할 상품의 이름을 입력하세요: ");
                String productName = scanner.nextLine();
                productNames[productCount] = productName;

                System.out.print("등록할 상품의 가격을 입력하세요: ");
                int productPrice = scanner.nextInt();
                productPrices[productCount] = productPrice;

                productCount++;


            } else if (option == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i]);
                }

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("올바른 메뉴를 선택하세요");
            }
        }
    }
}
