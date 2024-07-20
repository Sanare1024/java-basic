package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USERS);
        int currentUserConstant = 999;
        process(currentUserConstant++);
        process(currentUserConstant++);
        process(currentUserConstant++);

    }

    private static void process(int currentUserConstant) {
        System.out.println("참여자 수 :" + currentUserConstant);
        if (currentUserConstant > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
