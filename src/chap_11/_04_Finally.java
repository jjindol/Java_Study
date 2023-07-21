package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        try {
            System.out.println("택시의 문을 연다.");
            throw new Exception("휴무 택시");
        } catch (Exception e) {
            System.out.println("! 문제 발생: " + e.getMessage());
        } finally {
            System.out.println("택시의 문을 닫는다."); // 무조건 실행되는 문장
        }
        System.out.println("------------------");

        try {
            System.out.println(3 / 0);
        } finally {
            System.out.println("프로그램 정상 종료");
        }
    }
}
// try + catch
// try + catch + finally
// try + finally