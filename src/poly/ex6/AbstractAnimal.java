package poly.ex6;

public abstract class AbstractAnimal {
    public abstract void sound(); // 이건 추상메서드
    public void move() { // 이건 상속목적
        System.out.println("동물이 이동합니다");
    }
}
