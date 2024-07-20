package final1;

public class FinalRefMain {

    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data():

        //하지만 참조 대상은 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
    }
}
