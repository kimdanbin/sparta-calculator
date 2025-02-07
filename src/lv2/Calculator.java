package lv2;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculator {
//
    private ArrayList<Integer> results = new ArrayList<>();

//    getter
    public ArrayList<Integer> getResult() {
        return this.results;
    }

//    setter
    public void setResult(int result) {
        this.results.add(result);
    }

//    result의 가장 첫번째 원소 삭제
    public void removeResult() {
        if(!this.results.isEmpty()) {
            this.results.removeFirst();
        }
    }

    public int calculate(int num1, int num2, char op) {
        switch (op) {
            case '+':
                this.results.add(num1 + num2);
                break;
            case '-':
                this.results.add(num1 - num2);
                break;
            case '*':
                this.results.add(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    this.results.add(num1 / num2);
                } else {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    System.out.print("두 번째 숫자를 입력하세요: ");
                    num2 = new Scanner(System.in).nextInt();
                    calculate(num1, num2, '/');
                }
                break;
            default:
                break;
        }
        return this.results.getLast();
    }
}
