package chap_07;

import chap_07.Camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형(Primitive Data Types): int, float, double, long, boolean, ...
        int[] i = new int[3];
        System.out.println(i[0]); // 0

        double[] d = new double[3];
        System.out.println(d[0]); // 0.0

        // 참조 자료형(Reference Data Types): String, Camera, FactoryCam, ...
        String[] s = new String[3];
        System.out.println(s[0]); // null

        Camera[] c = new Camera[3];
        System.out.println(c[0]==null); // true

        System.out.println("---------------");

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "카메라1";
        c2.name = "카메라2";
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2 = c1;
        System.out.println(c1.name);
        System.out.println(c2.name);
        c2.name = "디지털 카메라";
        System.out.println(c1.name);
        System.out.println(c2.name);

        changeName(c2);
        System.out.println(c1.name);
        System.out.println(c2.name);

//      c2 = null; // 참조 관계를 끊는다.
//      System.out.println(c2.name);
    }
    public static void changeName(Camera camera) {
        camera.name = "새로운 카메라";
    }
}
