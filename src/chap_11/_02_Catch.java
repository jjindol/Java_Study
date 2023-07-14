package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
            System.out.println(3 / 0);
        } catch (ArithmeticException e) {
            System.out.println("계산 오류");
        } catch (Exception e) { // 이 예외로 넘어가지 않는다.
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("----------------");

        try {
            int[] arr = new int[3];
            arr[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 설정 오류");
        } catch (Exception e) { // 이 예외로 넘어가지 않는다.
            System.out.println("오류 발생: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("----------------");

        try {
            String s = null;
            System.out.println(s.toLowerCase());
        } catch (ArithmeticException e) {
            System.out.println("계산 오류");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 설정 오류");
        } catch (ClassCastException e) {
            System.out.println("형 변환 오류");
        } catch (Exception e) {
            System.out.println("그 외의 오류 처리");
            e.printStackTrace();
        }
    }
}
