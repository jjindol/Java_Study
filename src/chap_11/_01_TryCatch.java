package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외 처리
        // 오류: 컴파일 오류, 런타임 오류(error, exception)

        try { // 예시1
            System.out.println(3 / 0);
        } catch(Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }

        try { // 예시2
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }

        try { // 예시3
            Object obj = "test";
            System.out.println((int)obj);
        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
