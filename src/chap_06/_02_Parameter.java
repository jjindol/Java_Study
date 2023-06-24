package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int number) {
        int result = number * number;
        System.out.println(number + "의 2승은 " + result);
    }

    public static void powerByExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        System.out.println(number + "의 " + exponent + "승은 " + result);
    }

    public static void main(String[] args) {
        power(5);
        power(3);
        powerByExp(2, 5);
        powerByExp(3, 4);
    }
}
