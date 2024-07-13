package ref;

public class Method1 {

    public static void main(String[] args) {
        Student student1 = new Student(); //x001
        initStudent(student1, "학생1", 15, 90);
        // initStudent 매서드를 호출하면서 student1을 전달 -> student1의 참조값이 매개변수 student 에 전달된다


        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        pirntStudent(student1);
        pirntStudent(student2);
    }

    //student1이 참조하는 인스턴스에 값을 편리하게 할당하기 위해 initStudent() 매서드를 만들었다.
    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    //
    static void pirntStudent(Student student) {
        System.out.println("이름:" + student.name + " 나이:" + student.age + " 성적:" + student.grade);
    }
}
