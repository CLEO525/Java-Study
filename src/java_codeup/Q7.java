package java_codeup;

import java.util.Scanner;

/*
int형 정수 1갸를 입력 받아 공백을 사이에 두고 3번 출력해보자
 */
public class Q7 {
    public static void main(String[] args) {
        System.out.println("정수를 입력해주세요");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(n + " " + n + " " + n);
    }
}
