package chap_09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class _08_Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // by 다형성
        list.add("student1");
        list.add("(알 수 없음)");
        list.add("student2");
        list.add("student3");
        list.add("(알 수 없음)");
        list.add("student4");
        list.add("(알 수 없음)");
        list.add("student5");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("---------------");

        Iterator<String> i = list.iterator();
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());
        System.out.println(i.next());

        // 출력
        System.out.println("---------------");
        i = list.iterator(); // 커서를 처음 위치로 이동
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("---------------");

        // 삭제
        i = list.iterator();
        while (i.hasNext()) {
            String s = i.next();
            if (s.contains("(알 수 없음)")) {
                i.remove();
            }
        }
        i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        System.out.println("---------------");

        HashSet<String> set = new HashSet<>();
        set.add("teacher1");
        set.add("teacher2");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
