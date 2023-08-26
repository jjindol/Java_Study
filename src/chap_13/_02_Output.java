package chap_13;

public class _02_Output {
    public static void main(String[] args) {
        System.out.println("--------정수-------");
        System.out.printf("%d%n", 1); // 정수를 하나 출력하고 줄 바꿈
        System.out.printf("%d %d %d%n", 1, 2, 3);
        System.out.printf("%d%n", 1234);
        System.out.printf("%6d%n", 1234); // 6자리의 공간의 확보하고 1234 출력
        System.out.printf("%06d%n", 1234); // 빈 공간의 0으로 채운다
        System.out.printf("%6d%n", -1234);
        System.out.printf("%+6d%n", 1234); // 6자리 확보 후 + 부터 시작
        System.out.printf("%,+15d%n", 1000000000);
        System.out.printf("%-6d%n", 1234); // 왼쪽 정렬
    }
}
