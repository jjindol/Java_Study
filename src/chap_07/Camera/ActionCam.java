package chap_07.Camera;

public class ActionCam extends Camera {
    public final String lens = "광각렌즈";
    public ActionCam() {
        super("액션 카메라");
    }

    public final void makeVideo() { // final: 자식 클래스에서 오버라이딩 불가능
        System.out.println(this.name + " : " + this.lens + "로 촬영한 영상을 통해 비디오를 제작합니다.");
    }
}
