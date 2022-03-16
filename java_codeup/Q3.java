package java_codeup;
/*
실수형으로 변수를 선언하고 그 변수에 실수값을 저장한 후 저장되어있는 값을 출력해보자
 */
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.println("실수를 입력하시오.");
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        System.out.printf("%f", n);
    }
}
