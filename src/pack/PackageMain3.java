package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();  //자주 사용하는것을 import 하는게 좋음
        pack.b.User userB = new pack.b.User(); // 위에서 import를 했기 때문에 아래는 풀네임을 적어야함
    }
}
