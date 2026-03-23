package BitwiseOperators;

public class BitwiseOps {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else  {
            return false;
        }
    }

    public static boolean isEven1(int num) {
        if ((num & 1) == 0) {
            return true;
        } else   {
            return false;
        }
    }

    public static void main(String[] args) {
        //Task : To write a code that figures whether a number is even or odd but in systems, first in decimal level
        // and the second in bit level. Which one is faster? No doubt bit operation is faster!

        Long startTime = System.nanoTime();
        for(int i=0; i < 1_000_000; i++) {
            isEven1(30);
        }
        Long endTime = System.nanoTime();
        System.out.println("Time Taken: " +  (endTime - startTime) + " Nanoseconds");
    }
}
