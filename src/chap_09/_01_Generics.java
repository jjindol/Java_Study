package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        Integer[] iArray = {1, 2, 3, 4, 5};
        Double[] dArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A", "B", "C", "D", "E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        System.out.println("----------------------");

        printAnyArray(iArray); // 기본 자료형은 제네릭스 타입으로 바로 사용x
        printAnyArray(dArray); // 기본 자료형
        printAnyArray(sArray); // 참조 자료형은 가능
    } // 제네릭을 이용하면 하나의 메소드만 사용하면 된다.


    // T: Type, K: Key, E: Element, V : Value
    private static <T> void printAnyArray(T[] array) {
        for (T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }


    public static void printIntArray(Integer[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " "); // 1, 2, 3, 4, 5
        }
        System.out.println();
    }

    private static void printDoubleArray(Double[] dArray) {
        for (double i : dArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String i : sArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
