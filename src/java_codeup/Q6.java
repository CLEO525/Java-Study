package java_codeup;

import java.util.Scanner;

/*
실수 입력받아 둘째 자리까지 출력하기
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("실수를 입력하세요");
        float n = scanner.nextFloat();

        System.out.printf("%.2f",n);
    }
}
