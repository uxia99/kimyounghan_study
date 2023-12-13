package basic.method;

import java.util.Scanner;

public class MethodQuiz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        int output = 0;
        int balance = 0;



        while (true) {

            System.out.print("-----------------------------\n1.입금 | 2.출금 | 3.잔액 확인 | 4.종료\n-----------------------------\n선택 : ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("입금하실 금액을 입력하시오 : ₩");
                input = scanner.nextInt();
                balance += input;
                System.out.println("₩" + input + "을 입금하셨습니다. 현재 잔액 : ₩" + balance);
            }

            if (choice == 2) {
                System.out.print("출금하실 금액을 입력하시오 : ₩");
                output = scanner.nextInt();

                if (balance >= output) {
                    balance -= output;
                    System.out.println("₩" + output + "을 출금하셨습니다. 현재 잔액 : ₩" + balance);
                } else {
                    System.out.println("출금 잔액이 부족합니다.");
                }
            }

            if (choice == 3) {
                System.out.println("현재 잔액 : ₩" + balance);
                continue;
            }

            if (choice == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }
}
