package chap_09;

import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("student1");
        list.add("student2");
        list.add("student3");
        list.add("student4");
        list.add("student5");

        // 데이터 조회 (인덱스)
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("-----------------");

        // 추가
        list.addFirst("student0");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        System.out.println("추가 전: " + list.get(1));
        list.add(1, "teacher");
        System.out.println("추가 후: " + list.get(1));

        // 삭제
    }
}
