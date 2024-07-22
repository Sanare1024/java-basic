package poly.basic;

//upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child(0);
        Parent parent1 = (Parent) child; // 업캐스팅은 생략가능, 생략권장
        Parent parent2 = child; // 업캐스팅생략 (부모는 자식을 품을 수 있음)

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
