package ref;

public class NullMain1 {

    public static void main(String[] args) {
        Data data = null; // Data 타입을 받을 수 있는 참조형 변수 data 생성, 여기에 null값 할당(가르키는 객체가 없다는 뜻)
        System.out.println("1. data = " + data);

        data = new Data(); // 새로운 Data 객체를 생성하여 참조값을 data 변수에 할당(data가 참조할 객체가 존재)
        System.out.println("2. data = " + data);

        data = null; //  다시 data에 null값을 할당(가르키는 객체를 없애버림, 앞에서 만든 Data 인스턴스를 더이상 참조하지 않음)
        System.out.println("3. data = " + data);

        /*GC(Garbage Collection) : 아무도 참조하지 않는 인스턴스가 있다면
         GC가 더이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거해준다.*/
    }
}
