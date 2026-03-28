package BasicMath;

import java.util.Arrays;

public class Prime {

    public static boolean isPrime(int n) {
        for(int i=2; i < n; i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

//    public static int countPrimes(int n) {
//        int count = 0;
//        for(int i=2; i < n; i++){
//            if(isPrime(i)){
//                count++;
//            }
//        }
//        return count;
//    }

    //Sieve of Eratosthenes - Algorithm to find all prime to n in an efficient time
    public static int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);
        primes[0] = false;
        primes[1] = false;

        int count = 0;
        for(int i = 2; i < n; i++) {
            if(primes[i]) {
                count++;
                for(int j = 2*i; j < n; j = j + i) {
                    primes[j] = false;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
        System.out.println(countPrimes(10));
    }
}
