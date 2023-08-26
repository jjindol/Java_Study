package chap_13;

import java.util.Scanner;

public class _01_Input {
    public static void main(String[] args) { // 사용자 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name = sc.next(); // 값을 받아 String 형태로 반환

        System.out.print("혈액형을 입력하세요: ");
        String bloodType = sc.next();

        System.out.print("키를 입력하세요: ");
        int height = sc.nextInt();
        // Integer.parseInt(sc.next()) 도 가능

        System.out.println("몸무게를 입력하세요: ");
        double weight = sc.nextDouble();

        System.out.println("------------------");

        System.out.println("이름: " + name);
        System.out.println("혈액형: " + bloodType);
        System.out.println("키: " + height);
        System.out.println("뭄무게: " + weight);

        System.out.println("------------------");


        System.out.print("무슨 프로그래밍 언어를 배웠나요: ");
        String lang = sc.nextLine();
        System.out.println("언어: " +lang);

        System.out.print("소감은 어떤가요: ");
        String feeling = sc.nextLine();
        System.out.println("소감: " + feeling);
        // 한 문장 전체를 입력으로 받음
    }
}
