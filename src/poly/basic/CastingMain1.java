package poly.basic;

public class CastingMain1 {

    public static void main(String[] args) {
        // 부모변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child(0);
        //단 자식의 기능은 호출할 수 없다. 컴파일 오류 발생
        //poly.childMethod();

        //다운캐스팅 (부모 타입 -> 자식 타입으로 변환)
        Child child = (Child) poly; // poly의 참조값만 Child 타입 변수에 넣어버려
        child.childMethod();

    }
}
