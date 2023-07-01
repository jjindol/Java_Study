package chap_09;

import java.util.ArrayList;
import java.util.Collections;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크: List, Set, Map
        ArrayList<String> list = new ArrayList<>();
        // list 란 이름의 String 데이터를 보관하는 ArrayList 생성

        // 데이터 추가
        list.add("student1");
        list.add("student2");
        list.add("student3");
        list.add("student4");
        list.add("student5");

        // 데이터 조회 (index 기준)
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));

        System.out.println("----------------");

        // 삭제
        System.out.println("신청 학생 수(전): " + list.size()); // 5
        list.remove("student4");
        System.out.println("신청 학생 수(후): " + list.size()); // 4

        System.out.println("----------------");
        System.out.println(list.get(3));

        System.out.println("----------------");
        System.out.println("남은 학생 수(전): " + list.size());
        list.remove(list.size() - 1); // 마지막 인덱스 값을 삭제
        System.out.println("남은 학생 수(후): " + list.size());

        System.out.println("----------------");
        // 순회
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }
        System.out.println("----------------");

        // 변경
        System.out.println("수강권 양도 전: " + list.get(0));
        list.set(0, "student6");
        System.out.println("수강권 양도 후: " + list.get(0));
        System.out.println("----------------");

        // 확인
        System.out.println(list.indexOf("student2"));
        // 선착순 5명 내에 포함되어 있는가?
        if (list.contains("student2")) {
            System.out.println("수강신청 성공");
        } else {
            System.out.println("수강신청 실패");
        }
        System.out.println("----------------");

        // 전체 삭제
        list.clear();
        if (list.isEmpty()==true) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트 삭제가 완료되었습니다.");
        }
    }
}
