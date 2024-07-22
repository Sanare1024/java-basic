package poly.basic;

public class Child extends Parent {
    public int x;

    public Child(int x) {
        this.x = x;
    }

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
