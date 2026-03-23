package BitwiseOperators;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("~a:   " + (~a));
        System.out.println("~b:   " + (~b));
        System.out.println("~c:   " + (~c));
        System.out.println("a ^ b: " + (a ^ b));

        System.out.println(10 << 1);
        System.out.println(10 >> 1);
        System.out.println(10 >> 10);
        System.out.println(10 << 2);
    }
}
