package poly.ex.pay1;

public abstract class PayStore {

    public static Pay findPay(String option) {
        if (option.equals("kakao")) {
            return  new KakaoPay(); // 인자를 요구하게
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else if (option.equals("new")) {
            return new NewPay();
        } else {
            return new DefaultPay();
        }
    }
}

// 원래는 내가 생성하면 -> 제어권 가짐 이거맞음?
// 프레임워크한테 <- 뭐쓸지모름 니가 알아서 집어넣어
