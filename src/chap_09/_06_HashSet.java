package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // 중복 데이터를 허용하지 않는다.
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("D");
        set.add("E");

        System.out.println("총 구매 상품 수: " + set.size());

        for (String s : set) {
            System.out.println(s);
        }

        // 확인
        if(set.contains("C")) {
            System.out.println("해당 인덱스를 포함합니다.");
        } else {
            System.out.println("존재하지 않습니다.");
        }

        System.out.println("----------------");

        // 삭제
        System.out.println("삭제 전 인덱스: " + set.size());
        set.remove("A");
        System.out.println("삭제 후 인덱스: " + set.size());

        System.out.println("----------------");

        // 전체 삭제
        set.clear();
        if(set.isEmpty()) {
            System.out.println("전체 삭제 후 인덱스: " + set.size());
        }

        System.out.println("----------------");

        // 세트: 중복 허용x, 순서 보장x, Linked 를 붙이면 순서는 보장 된다.
        HashSet<Integer> intSet = new LinkedHashSet<>();
        intSet.add(1);
        intSet.add(13);
        intSet.add(2);

        for (int i : intSet) {
            System.out.println(i);
        }

    }

}
