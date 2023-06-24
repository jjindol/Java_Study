package chap_06;

public class _09_Quiz {
    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0,index); // 이진수 > 이
        // for(int i = index; i < data.length(); i++)
        for (int i = 0; i < data.length()-index; i++) {
            hiddenData = hiddenData + "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        String name = "이진수";
        String id = "980604-1000000";
        String phone = "010-1234-5678";

        System.out.println("이름 " + getHiddenData(name, 1));
        System.out.println("주민등록번호: " + getHiddenData(id, 8));
        System.out.println("전화번호: " + getHiddenData(phone, 9));
    }
}
