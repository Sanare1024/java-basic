package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // Student 변수를 보관할 수 있는 사이즈'2'의 배열 생성 (Student 변수는 인스턴스의 참조값을 보관)
        students[0] = student1; // 배열에는 참조값이 대입하지 않아서 null상태 -> 참조값을 넣어주기
        students[1] = student2; // **자바에서 변수의 대입(=)은 항상 변수에 들어있는 값을 복사한다**

        System.out.println("이름:" + students[0].name + " 나이:"+ students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:"+ students[1].age + " 성적:" + students[1].grade);

    }
}
