package chap_09;

import java.util.HashMap;

public class _07_HashMap {
    public static void main(String[] args) {
        // 맵 (Key, Value)
        HashMap<String, Integer> map = new HashMap<>();

        // 데이터 추가
        map.put("student1", 10);
        map.put("student2", 5);
        map.put("student3", 3);

        System.out.println("총 학생 수: " + map.size());
        System.out.println("------------------");

        // 조회
        System.out.println("student1의 포인트: " + map.get("student1"));
        System.out.println("student2의 포인트: " + map.get("student2"));
        System.out.println("------------------");

        // 확인
        if (map.containsKey("student3")) {
            int point = map.get("student3");
            map.put("student3", ++point);
            System.out.println("student3의 누적 포인트: " + map.get("student3"));
        } else {
            map.put("student1", 1);
            System.out.println("신규 등록 (포인트 1)");
        }
        System.out.println("------------------");

        // Key 순회
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        System.out.println("------------------");

        // Value 순회
        for (Integer value : map.values()) {
            System.out.println(value);
        }
        System.out.println("------------------");

        // Key, Value 동시에 확인
        for (String key : map.keySet()) {
            System.out.println("학생 이름: " + key + "\t포인트: " + map.get(key));
        }
        System.out.println("------------------");


        // 삭제
        map.remove("student1");
        System.out.println(map.get("student1"));
        System.out.println("------------------");

        // 전체 삭제
        map.clear();
        if (map.isEmpty()) {
            System.out.println("남은 학생 수: " + map.size());
        }
    }
}
