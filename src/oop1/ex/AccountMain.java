package oop1.ex;

public class AccountMain {

    public static void main(String[] args) {
        Account account = new Account();
        account.deposit(10000); // 계좌에 10000원 입금
        account.withdraw(9000); // 계좌에 9000원 출금
        account.withdraw(2000); // 계좌에 2000원 출금시도 -> 잔액부족
        System.out.println("잔고 : " + account.balanece);// 잔액을 출력
    }
}
