package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1; //public 걍 가능
        protectedValue = 1; // 상속 관계 or 같은 패키지면 가능
        //defaultValue = 1; //다른 패키지라 접근불가 compile error
        //privateValue = 1; //당연히 접근불가

        publicMethod();
        protectedMethod();
        //defaultMethod();
        //privateMethod();

        printParent();
    }
}
