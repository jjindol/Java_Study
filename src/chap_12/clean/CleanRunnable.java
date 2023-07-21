package chap_12.clean;

public class CleanRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("-- (직원) 청소 시작 --");
        for (int i = 1; i <=10 ; i+=2) {
            System.out.println("(직원) " + i + "번방 청소 중");
        }
        System.out.println("(직원) 청소 끝");
    }
}
