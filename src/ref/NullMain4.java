package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigdata = new BigData();
        bigdata.data = new Data();
        System.out.println("bigData.count = " + bigdata.count); //count는 int라 초기값 0 찍힘
        System.out.println("bigData.data = " + bigdata.data); // data는 참조형이라 null 찍힘

        //NullPointerException
        System.out.println("bigData.vlaue = " + bigdata.data.value); //
    }
}
