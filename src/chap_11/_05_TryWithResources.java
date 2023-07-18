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


public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;
        try {
            writer1 = new MyFileWriter();
            writer1.write("자바 공부.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close(); // close 실행하다가 문제가 발생할 수 있어 그에 대한 처리를 해 줌
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("---------------------");

        try(MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("파이썬 공부");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
