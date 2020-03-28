package work10;

public class Main {

    public static void main(String[] args) {
        int i = 0;
        for (i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("ตัวเลขที่เป็นเลขคู่ = " + i);
            }
        }
        
        System.out.println("--------------------------------");
        
        for (i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println("ตัวเลขที่เป็นเลขคี่ = " + i);
            }
        }
    }
}
