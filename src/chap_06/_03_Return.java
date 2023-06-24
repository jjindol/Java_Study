package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phoneNumber = "02-1234-5678";
        return phoneNumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울 특별시 양천구";
    }

    // 호텔 액티비티
    public static String getActivities() {
        return "노래방, 당구장";
    }

    public static void main(String[] args) {

        System.out.println("호텔 전화번호: " + getPhoneNumber());

        String address = getAddress();
        System.out.println("호텔 주소: " + address);

        System.out.println("호텔 액티비티: " + getActivities());

    }
}
