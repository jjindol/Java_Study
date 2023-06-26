package chap_07;

import chap_07.Camera.Camera;
import chap_07.Camera.FactoryCam;
import chap_07.Camera.SpeedCam;

public class _14_Polymorphism { // 다형성
    public static void main(String[] args) {
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        Camera speedCam = new SpeedCam();

        camera.showMainFeature();
        factoryCam.showMainFeature();
        speedCam.showMainFeature();

        System.out.println("-------------------------------------------");

        Camera[] cameras = new Camera[3];
        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for (int i = 0; i < 3; i++) {
            cameras[i].showMainFeature();
        }

        System.out.println("-------------------------------------------");

        if (camera instanceof Camera) {
            System.out.println("카메라 입니다.");
        }
        if (factoryCam instanceof FactoryCam) {
            ((FactoryCam)factoryCam).detectFire(); // 형변환 필요
        }
        if (speedCam instanceof SpeedCam) {
            ((SpeedCam)speedCam).checkSpeed();
            ((SpeedCam)speedCam).recognizeLicensePlate();
        }
    }
}
