package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        Student student2 = createStudent("학생2", 16, 80);

        pirntStudent(student1);
        pirntStudent(student2);
    }

    //createStudent라는 메서드를 생성
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade; //Student에 객체를 생서하는 부분을 메서드 안에 포함시켜 메서드 하나로 객체 설정과 초기값 설정을 모두 처리
        return student; // 하지만 메서드 안에서 객체를 생성했기 때문에 생성된 객체를 메서드 밖으로 돌려줘야한다(반환 = return)
    }

    //
    static void pirntStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
