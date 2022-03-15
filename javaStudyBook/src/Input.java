import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        /*
        //입력한 한줄을 그대로 출력
        scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input);


        //띄어쓰기 단위로 되돌려주기
        System.out.println("영어 단어와 한글단어를 하나씩 입력해 보세요");
        Scanner scanner1 = new Scanner(System.in);

        String englishWord = scanner1.nextLine();
        String koreanWord = scanner1.nextLine();

        System.out.println("입력된 영단어 : " + englishWord);
        System.out.println("입력된 한글 단어 : " + koreanWord);

        //단어로 끊기
        Scanner scanner2 =  new Scanner(System.in);
        String input2 = scanner2.next();
        String input3 = scanner2.next();
        String input4 = scanner2.next();
        String input5 = scanner2.next();

        System.out.println(input2);
        System.out.println(input3);
        System.out.println(input4);
        System.out.println(input5);
        */

        //키보드로 입력받은 숫자 사용하기
        System.out.println("숫자를 하나 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);

    }
}
