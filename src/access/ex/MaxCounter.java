package access.ex;

public class MaxCounter {
    private int count = 0;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return; //else를 안하고 return으로 날릴경우 = 여기까진 검증로직(검증로직이 많을 때 이렇게 쓰면 명확해짐)
        }
        count++; //여긴 실행로직으로 구분할 수 있음
    }

    public int getCount() {
        return count;
    }
}
