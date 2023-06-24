package chap_06;

public class _05_Overloading {
    public static int getPower(int number) {
        int result = number * number;
        return result;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
        return number * number;
    }

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        int A = getPower(3);
        System.out.println(A);

        System.out.println(getPower("12")); // 12*12
        System.out.println(getPower(3,3));
    }
    // 메소드 오버로딩
    // 같은 이름의 메소드를 여러번 중복해서 사용함, 전달값의 타입이나 갯수가 달라야 한다.

}
