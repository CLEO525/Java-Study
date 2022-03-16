package java_codeup;
/*
년, 월, 일을 입력받아 지정된 형식으로 출력하는 연습을 해보자
 */
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");

        String str = scanner.nextLine();
        String[] n = str.split("\\.");

        int n1 = Integer.parseInt(n[0]);
        int n2 = Integer.parseInt(n[1]);
        int n3 = Integer.parseInt(n[2]);

        System.out.printf("%04d.%02d.%02d", n1,n2,n3);

    }
}
