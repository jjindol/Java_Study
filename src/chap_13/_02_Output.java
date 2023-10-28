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

        System.out.println("--------실수-------");
        System.out.printf("%f%n", Math.PI);
        System.out.printf("%.2f%n", Math.PI); // 소수점 둘째 자리까지 표현
        System.out.printf("%6.2f%n", Math.PI); // 6자리 공간 확보 후 출력
        System.out.printf("%-6.2f%n", Math.PI); // 왼쪽 정렬
        System.out.printf("%06.2f%n", Math.PI); // 왼쪽 정렬

        System.out.println("--------문자열-------");
        System.out.printf("%s%n", "Java");
        System.out.printf("%6s%n", "Java"); // __Java
        System.out.printf("%-6s%n", "Java"); // 좌측 정렬
        System.out.printf("%6.2s%n", "Java"); // ____Ja
        System.out.printf("%-6.2s%n", "Java"); // ____Ja

        System.out.println("--------응용1-------");
        System.out.println("이름 영어 수학 평균");
        System.out.println("학생1 " + 90 + " " + 80 + " " + 85.0);
        System.out.println("학생2 " + 100 + " " + 100 + " " + 100.0);
        System.out.println("학생3 " + 95 + " " + 100 + " " + 97.5);

        System.out.println("--------응용2-------");
        System.out.println("이름      영어   수학   평균"); // 공백: 6 3 3
        System.out.printf("%-6s %4d %4d %6.1f%n", "학생1", 90, 80, 85.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "학생2", 100, 100, 100.0);
        System.out.printf("%-6s %4d %4d %6.1f%n", "학생3", 95, 100, 97.5);

    }

// %d: decimal integer: 10진 정수 형식
// %f: floating-point: 부동 소수점 형식