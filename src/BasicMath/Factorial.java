package BasicMath;

import java.util.Scanner;

public class Factorial {

    //Task
    public static void printNum(int n) {
        if(n == 0) return;
        System.out.print(n + " ");
        printNum(n - 1);
    }

    //Task 2
    public static int sumToNum(int n) {
        if(n == 0) return 0;
        return n + sumToNum(n - 1);
    }

    public static int fact(int num) {
        //System.out.println("calling fact of " + num);
        if (num == 1) return 1;
        return num * fact(num - 1);
    }

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.print("Type a number: ");
        //int n = sc.nextInt();
        int n = 5;


        int result = 1;
        for (int i=n;i>=1;i--) {
            result *= i;
        }

        System.out.println("Result: " + result);
        System.out.println("Factorial of " + "num" + " is " + fact(n));
        printNum(n);
        System.out.println();
        System.out.print("Sum of num: " +  sumToNum(n));
    }
}
