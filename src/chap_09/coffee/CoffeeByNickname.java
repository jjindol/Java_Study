package chap_09.coffee;

public class CoffeeByNickname {
    public String nickname; // 닉네임을 저장하기 위한 String 변수

    public CoffeeByNickname(String nickname) {
        this.nickname = nickname;
    }

    public void ready() {
        System.out.println("커피 준비 완료: " + nickname);
    }


}
