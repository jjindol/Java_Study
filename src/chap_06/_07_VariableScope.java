package chap_06;

public class _07_VariableScope {
    public static void methodA() {
        // System.out.println(number);
    }
    public static void methodB() {
        int result = 1; // 지역 변수: 중괄호 안에서만 사용 가능
    }

    public static void main(String[] args) {
        int number = 3;

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i); > 사용 불가능
        System.out.println(number); // 중괄호 내에서는 가능
    }
}
