package access.a;

public class AccessInnerMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 default 호출 가능
        data.defaultField = 2;
        data.defaultMethod();

        //private 호출 불가
        //data.privateField = 3;
        //data.privateMethod();

        data.innerAccess(); //메서드 자체는 public이기 때문에 외부에서 호출하였지만
                            // 메서드 자체는 AccessData에 포함되어 있기 때문에 private 필드, 메서드 모두 접근가능
    }
}
