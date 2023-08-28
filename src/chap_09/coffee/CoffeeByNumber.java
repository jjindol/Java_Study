package chap_09.coffee;

public class CoffeeByNumber {
    public int waitingNumber; // 대기 번호를 저장하는 변수

    public CoffeeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + waitingNumber);
    }
}
