package chap_10;

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }
    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.order("아메리카노");

        Coffee c2 = new Coffee();
        c2.order("라떼");

        System.out.println("------------------");

        Coffee specialCoffee = new Coffee() {
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("케익은 서비스 입니다.");
            }
            public void returnTray() {
                super.returnTray();
            }
        };
        specialCoffee.order("바닐라 라떼");
        specialCoffee.returnTray();
    }
}
