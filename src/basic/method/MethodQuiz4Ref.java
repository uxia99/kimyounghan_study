package basic.method;

import java.util.Scanner;

public class MethodQuiz4Ref {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amount = 0;
        int balance = 0;



        while (true) {
            System.out.println("-----------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------");
            System.out.print("선택 : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("입금하실 금액을 입력하시오 : ₩");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;

                case 2:
                    System.out.print("출금하실 금액을 입력하시오 : ₩");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;

                case 3:
                    System.out.println("현재 잔액 : ₩" + balance);
                    break;

                case 4:
                    System.out.println("시스템을 종료합니다.");
                    return; // return; 해도 됨 - 메인메서드 밖으로 나가 끝내버림
                default:
                    System.out.println("올바른 선택이 아닙니다. 다시 입력해주세요.");
            }
        }
    }

    public static int deposit(int balance, int amount) {
        balance += amount;
        System.out.println("₩" + amount + "을 입금하셨습니다. 현재 잔액 : ₩" + balance);
        return balance;
    }

    public static int withdraw(int balance, int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("₩" + amount + "을 출금하셨습니다. 현재 잔액 : ₩" + balance);
        } else {
            System.out.println("출금 잔액이 부족합니다.");
        }

        return balance;
    }
}
