package chap_09;

import java.util.Collections;
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

        System.out.println("-----------------");

        // 삭제
        System.out.println("삭제 전 학생 수: " + list.size());
        list.remove(list.size() - 1);
        list.removeFirst();
        list.removeLast();
        System.out.println("삭제 후 학생 수: " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        // 변경
        list.set(0, "student0");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("학생 수: " + list.size());
            System.out.println("리스트가 비었습니다");
        }
        System.out.println("-----------------");

        list.add("student4");
        list.add("student2");
        list.add("student1");
        list.add("student3");


        Collections.sort(list);

        for (String s :
                list) {
            System.out.println(s);
        }


    }
}
