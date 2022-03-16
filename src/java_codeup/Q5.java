package java_codeup;

import java.util.Scanner;

/*
문자 2개 입력받아 순서 바꿔 출력하기
 */
public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 단어");
        String str1 = scanner.next();

        System.out.println("두번째 단어");
        String str2 = scanner.next();

        System.out.println("글자 출력");
        System.out.println(str2);
        System.out.println(str1);
    }
}
