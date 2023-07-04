package chap_10;

abstract class HomeMadeBurger {
    public abstract void cook();
}


public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        HomeMadeBurger momMade = getMomMade();
        momMade.cook();
        System.out.println("---------------------");

        HomeMadeBurger broMade = getBroMade();
        broMade.cook();
    }

    private static HomeMadeBurger getBroMade() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만든 동생표 햄버거");
                System.out.println("재료: 빵, 패티, 딸기잼, 치즈");
            }
        };
    }

    public static HomeMadeBurger getMomMade() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만든 수제 버거");
                System.out.println("재료: 빵, 패티, 양상추");
            }
        };
    }


}
