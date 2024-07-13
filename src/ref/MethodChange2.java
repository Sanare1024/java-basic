package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value);
    }

    static void changeReference(Data dataX) {
        dataX.value = 20;
    }

    // 자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. but 이 값이 실제 값이냐 참조값이냐에 따라 동작이 달라짐
}
