package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number) {
        return getPower(number, 2);
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * number;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getPower(2,2));
        System.out.println(getPower(3,3));
        System.out.println(getPower(4,2));
    }
    // 코드를 간결하게 하고 중복을 피하기 위함
}
