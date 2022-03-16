package java_codeup;

import java.util.Scanner;

/*
어떤형식(글자 + 숫자)이 입력될때 그대로 출력해보자
 */
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("시간을 입력해주세요");

        String str = scanner.nextLine();
        System.out.println(str);
    }
}
