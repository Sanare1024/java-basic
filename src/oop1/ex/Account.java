package oop1.ex;

public class Account {
    int balanece; //잔액

    //입금 메서드
    void deposit(int amount) {
        balanece += amount;
    }
    //출금 메서드
    void withdraw(int amount) {
        if (balanece >= amount) {
            balanece -= amount;
        } else {
            System.out.println("잔액부족");
        }
    }
}
