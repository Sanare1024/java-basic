package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        Student student1; //Student 타입을 받을 수 있는 변수를 선언
        student1 = new Student(); // new Student()는 Student라는 클래스를 기반으로 새로운 객체를 생성하라는 뜻(객체의 주소 = 참조값)
        student1.name = "학생1"; // .은 실제 객체에 접근할 때 사용
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

    //  System.out.println(student1); 참조값 확인해보기
    //  System.out.println(student2); 참조값 확인해보기

        System.out.println("이름:" + student1.name + " 나이:"+ student1.age + " 성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:"+ student2.age + " 성적:" + student2.grade);

        /* 타입 = 데이터의 종류나 형태(int는 정수타입, String은 문자타입)
        이러면 학생(Student)라는 타입을 만들면 되는거 아닌가? -> 사용자가 직접 정의하는 타입은 설계도가 필요
        이때 설계도 = 클래스 이다. -> 이 클래스를 가지고 실제 메모리에 만들어진 실체 = 객체 or 인스턴스
         */
    }
}
