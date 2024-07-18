package memory;

public class JavaMemoryMain2 {

    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end"); // method1이 종료되면서 x001은 더이상 참조하는곳이 없음 = GC의 대상으로 제거됨[5]
    }

    static void method1() {
        System.out.println("method1 start");
        Data data1 = new Data(10); //참조값(x001)생성  [1]
        method2(data1); //매개변수로 위에 참조값을 넘김 / 이제부터 data1과 data2는 같은 x001 인스턴스를 참조하게됨 [2]
        System.out.println("method1 end"); // method1이 종료 되면서 스택프레임 제거 data1제거 [4]
    }

    static void method2(Data data2) {
        System.out.println("method2 start");
        System.out.println("data.value = " + data2.getValue());
        System.out.println("method2 end"); //method2 종료되면서 스택프레임이 제거 / data2 또한 제거 [3]
    }
}
