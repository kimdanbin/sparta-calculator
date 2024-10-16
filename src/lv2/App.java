package lv2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        String exit = "";

//        setter와 getter
        System.out.println("setter setResult(100) 실행");
        calc.setResult(100);
        System.out.println(calc.getResult());
        System.out.println("처음원소삭제 removeResult() 실행");
        calc.removeResult();
        System.out.println(calc.getResult());

//        exit문자열이 나올때까지 반복
        while (!exit.equals("exit")) {
//        첫번째 숫자 입력
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();

//        두번째 숫자 입력
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

//        연산자 입력
            System.out.print("사칙연산 기호를 입력하세요: ");
            char op = sc.next().charAt(0);

//            연산 & 결과 보여주는 부분
            int result = calc.calculate(num1, num2, op);

            System.out.println("결과: " + result);

//            getter
            if (!calc.getResult().isEmpty()) {

                System.out.println(calc.getResult());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            exit = sc.next();

        }


    }
}
