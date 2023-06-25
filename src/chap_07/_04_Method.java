package chap_07;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox b1 = new BlackBox();
        b1.modelName = "BMW";

        b1.autoReport(); // 지원 안됨
        BlackBox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemoryCard(256);

        // 일반 영상: 1(type)
        // 충돌 감지 영상: 2
        System.out.println("일반 영상 파일 수: " + b1.getVideoFileCount(1));
        System.out.println("출동 감지 영상 파일 수: " + b1.getVideoFileCount(2));
    }
}
