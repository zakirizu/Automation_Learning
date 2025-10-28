package operators;

public class Bitwise_Operators {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011

        System.out.println("a & b: " + (a & b)); // 1  (0001)
        System.out.println("a | b: " + (a | b)); // 7  (0111)
        System.out.println("a ^ b: " + (a ^ b)); // 6  (0110)
        System.out.println("~a: " + (~a));       // -6
        System.out.println("a << 1: " + (a << 1)); // 10 (Left Shift)
        System.out.println("a >> 1: " + (a >> 1)); // 2  (Right Shift)
    }
}
//Not so commonlu used
