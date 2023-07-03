package chap_09.user;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    String certification;

    public Student(String name, String certification) {
        this.name = name;
        this.certification = certification;
    }
}

public class _Quiz_09 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("유재석", "파이썬"));
        list.add(new Student("박명수", "자바"));
        list.add(new Student("김종국", "자바"));
        list.add(new Student("조세호", "C"));
        list.add(new Student("서장훈", "파이썬"));

        System.out.println("자바 자격증을 보유한 학생");
        System.out.println("---------------------");

        for (Student student : list) {
            if (student.certification.equals("자바")) {
                System.out.println(student.name);
            }
        }
    }
}
// '==' 연산자는 변수가 같은 객체를 참조하는지 확인
// equals() 메소드는 객체의 내용을 비교
