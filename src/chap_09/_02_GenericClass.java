package chap_09;

import chap_09.coffee.*;
import chap_09.user.User;
import chap_09.user.VipUser;

public class _02_GenericClass { // 코드의 중복을 없애고 값을 가져올 때 형 변환x
    public static void main(String[] args) {
        CoffeeByNumber c1 = new CoffeeByNumber(33);
        c1.ready();

        CoffeeByNickname c2 = new CoffeeByNickname("이진수");
        c2.ready();

        System.out.println("---------------------");

        CoffeeByName c3 = new CoffeeByName(34);
        c3.ready();

        CoffeeByName c4 = new CoffeeByName("삼진수");
        c4.ready();

        System.out.println("---------------------");

        int c3Name = (int)c3.name;
        System.out.println("주문 고객 번호: " + c3Name);

        String c4Name = (String)(c4.name);
        System.out.println("주문 고객 이름: " + c4Name);

        // c4Name = (String) c3.name; // Integer cannot be cast to class java.lang.String
        System.out.println("---------------------");



        Coffee<Integer> c5 = new Coffee<>(35);
        c5.ready();
        int c5Name = c5.name; // 형변환 필요 없음!
        System.out.println("주문 고객 번호: " + c5Name);

        Coffee<String> c6 = new Coffee<>("사진수");
        c6.ready();
        String c6Name = c6.name;
        System.out.println("주문 고객 이름: " + c6Name);

        System.out.println("---------------------");
        CoffeeByUser<User> c7 = new CoffeeByUser<>(new User("오진수"));
        c7.ready();

        CoffeeByUser<User> c8 = new CoffeeByUser<>(new VipUser("육진수"));
        c8.ready();
    }
}
