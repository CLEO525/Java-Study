package javastudybook;

public class Operator {
    public static void main(String[] args) {
        //산술 연산자
        System.out.println(2 + 3);
        System.out.println(5 - 2);
        System.out.println(2 * 3);
        System.out.println(6 / 3);
        System.out.println(7 % 3);
        System.out.println(7 / 2); // 정수 뒷 부분은 버림으로 처리됨

        System.out.println((2 - 4) / 2);

        //대입연산자
        int number = 5;
        number = (int)1.2; //실수 -> 정수 소숫점 아래 버림
        System.out.println(number);

        System.out.println(1 + 1.2);
        System.out.println(7 / 2);
        System.out.println(7 / 2.0); //실수로 나오게됨


        //비교 연산자
        System.out.println(2 < 3);
        System.out.println(2 <= 3);
        System.out.println(2 > 3);
        System.out.println(3 >= 3);
        System.out.println(5 == 3);
        System.out.println(5 == 5);
        System.out.println(5 != 5);
        System.out.println(3 != 5);
    }
}
