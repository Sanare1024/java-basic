package poly.Car1;

public class Driver {

    private Car car; // 멤버 변수

    public void setCar(Car car) { // 멤버변수에 자동차를 설정, 외부에서 이 메서드를 호출해주어야 Driver가 새로운 자동차를 참조하거나 변경가능
        System.out.println("자동차를 설정합니다 : " + car);
        this.car = car;
    }

    public void drive() {  //Car 인터페이스가 제공하는 기능들을 통하여 자동차를 운전
        System.out.println("자동차를 운전합니다.");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
