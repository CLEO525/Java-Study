package java_codeup;
/*
정수를 2개 입력받아 그대로 출력하기
 */

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("첫번째 정수입력");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.println("두번째 정수입력");
        int n2 = scanner.nextInt();

        System.out.println("입력된 정수1 : " + n1 +"\n입력된 정수2 : " + n2);
    }
}
