package chap_08;

import chap_08.camera.Camera;
import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 추상 클래스: 아직 완성되지 않은 클래스
        // 추상 메소드: 추상 클래스나 인터페이스에서 사용 가능한, 껍데기만 있는 메소드

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();
    }
}
