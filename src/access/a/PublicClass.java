package access.a;

public class PublicClass { //public class는 반드시 파일명과 이름이 같아야한다 = 1개밖에 못 만든다.

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();
    }
}

class DefaultClass1{ //대신 default call는 무제한

}

class DefaultClass2{

}