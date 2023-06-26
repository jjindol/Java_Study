package chap_08;

import chap_07.BlackBoxRefurbish;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "BMW"; // public
        // b1.resolution = "FHD"; // default, 사용x
        // b1.price = 200000; // private, 사용x
        // b1.color = "블랙"; // protected, 사용x
    }
}
