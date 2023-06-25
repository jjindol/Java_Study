package chap_07;

public class BlackBox { // 설계도
    String modelName;
    String resolution;
    int price;
    String color;

    static boolean canAutoReport = false; // 자동 신고 기능, 클래스 변수(클래스 내부에 선언됨)

    void autoReport() { // 전달값, 반환값 x
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

    void insertMemoryCard(int capacity) { // 전달값 존재
        System.out.println("메모리 카드가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) { // 전달값과 반환값 존재
        if(type==1) {
            return 9;
        } else if(type==2) {
            return 1;
        }
        return 10;
    }
}

