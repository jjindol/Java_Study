package chap_07;

public class BlackBox { // 설계도
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    static int counter = 0; // 시리얼 번호를 생성해주는 역할(0 > ++ 연산을 통해 값 증가)

    static boolean canAutoReport = false; // 자동 신고 기능, 클래스 변수(클래스 내부에 선언됨)

    BlackBox() {
        System.out.println("기본 생성자 호출");
        this.serialNumber = ++counter;
        System.out.println("새로운 시리얼 넘버 발급: " + this.serialNumber);
    }

    BlackBox(String modelName, String resolution, int price, String color) {
        this(); // 기본 생성자의 역할을 수행!

        System.out.println("사용자 정의 생성자 호출");
        this.modelName = modelName;
        this.resolution = resolution;
        this.price = price;
        this.color = color;
    }

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

    // showDateTime: 날짜정보 표시여부
    // showSpeed: 속도정보 표시여부
    // min: 영상 기록 단위(분)
    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도정보가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true, true, 5);
    }

    static void callServiceCenter() {
        System.out.println("서비스 센터(1588-0000) 로 연결합니다.");
        canAutoReport = false; // static 으로 선언한 변수는 static 메소드에서 사용 가능
        // 인스턴스 변수는 객체가 생성된 후 만들어지기 때문에 static 클래스 내에서 직접 접근x
    }

    void appendModelName(String modelName) {
        this.modelName += modelName; // 클래스의 인스턴스 변수에 직접 접근
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if (resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요";
        }
        return resolution;
    }
    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }
    void setPrice(int price) {
        if (price < 100000) {
            this.price = 10000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}

