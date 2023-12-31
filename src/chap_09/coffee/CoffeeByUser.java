package chap_09.coffee;

import chap_09.user.User;

public class CoffeeByUser <T extends User> { // User 를 상속하는 클래스만 접근 가능
    public T user;

    public CoffeeByUser(T user) {
        this.user = user;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + user.name);
        user.addPoint();
    }


}
