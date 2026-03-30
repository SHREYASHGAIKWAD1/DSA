package BasicMath;

public class Power {
    public static int powerOf(int x, int n) {
        if(n == 0) return 1;
        if(n == 1) return x;
        return x * powerOf(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(powerOf(3,3));
    }
}
