package ref;

public class VarChange2 {

    public static void main(String[] args) {
        /*자바에서 변수에 값을 대입하는것은 변수에 들어 있는 값을 복사해서 대입하는 것이다.
        기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고,
        참조형이면 변수에 들어있는 참조값을 복사해서 대입한다.
        */
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA; //dataA에 있는 참조값을 복사해서 dataB에 넣음(둘다 같은 인스턴스를 바라보게 됨)

        System.out.println("dataA 참조값=" + dataA);
        System.out.println("dataB 참조값=" + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataA 변경
        dataA.value = 20; // x001.vlaue를 20으로 바꿈
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //dataB변경
        dataB.value = 30; // x001.vlaue를 30으로 바꿈
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        //Data dataB = dataA라고 했을때 dataA 와 dataB 는 같은 참조값을 가지게되고 같은 객체 인스턴스를 참조하게됨
    }
}
