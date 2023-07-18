package chap_11;

public class _06_CustomException {
    public static void main(String[] args) {
        int age = 17;
        try {
            if (age < 19) {
                throw new AgeLessThan19("만 19세 미만에게는 판매하지 않습니다.");
            } else {
                System.out.println("주문하신 상품입니다.");
            }
        } catch (AgeLessThan19 e) {
            System.out.println("다른 상품을 구매해 주세요.");
        } catch (Exception e) {
            System.out.println("모든 예외 처리");
        }
    }
}

class AgeLessThan19 extends Exception {
    public AgeLessThan19(String message) {
        super(message);
    }
}