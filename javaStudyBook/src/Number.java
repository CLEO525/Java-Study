public class Number {
    public static void main(String[] args) {
        //정수형 변수
        byte byteInteger = 10;
        short shortInteger = 20;
        int intInteger = 30;
        long longInteger = 40;

        int sum = byteInteger + shortInteger;
        int sum2 = shortInteger + intInteger;
        long sum3 = intInteger + longInteger;
        long sum4 = byteInteger + longInteger;

        //실수형 변수
        float floatNumber = 1.2f;
        double doubleNumber = 4.3;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        float floatSum = 0.001f + 0.001f + 0.0001f;
        System.out.println(floatSum); //실수형 계산은 정밀하지 못하기 때문에 정밀한 계산은 정수형으로 한 뒤 나눗셈으로 소수점을 구함

        //문자형 변수
        char character = 'K';
        System.out.println(character);

        //문자열 변수
        String chicken = "치킨은 살 안 쪄요.";
        String me = "살은 내가 쪄요.";
        System.out.println(chicken);
        System.out.println(me);

        //문자열 연결하기
        String chickenAndMe = chicken + me;
        System.out.println(chickenAndMe);

        //문자열의 글자 수 세기
        int length = me.length();
        System.out.println(length);

        //문자열 일부 바꾸기
        String replaced = me.replaceAll("내가", "치킨이");
        System.out.println(replaced);

        //문자열 자르기
        String birthDay = "1995/10/10";
        String year = birthDay.substring(0, 4);
        String day = birthDay.substring(8);

        System.out.println(year);
        System.out.println(day);
    }
}
