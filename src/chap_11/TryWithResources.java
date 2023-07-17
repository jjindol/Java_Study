package chap_11;


class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 종료합니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력 내용: " + line);
    }
}




public class TryWithResources {
    public static void main(String[] args) {

    }
}
