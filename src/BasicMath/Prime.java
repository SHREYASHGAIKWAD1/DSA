package BasicMath;

public class Prime {

    public static boolean isPrime(int n) {
        for(int i=2; i*i <= n; i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
