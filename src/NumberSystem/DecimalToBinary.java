package NumberSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


// Binary Timeline Method to convert from decimal to binary number

    // 2^6 | 2^5 | 2^4 | 2^3 | 2^2 | 2^1 | 2^0
    // 64  | 32  | 16  |  8  |  4  |  2  |  1
    //  0     0     0     1     1     1     1

    // for example the number is 15
    //Therefore, in binary system 15 will 1111

class Converter {

    public StringBuilder toBinary(int decimal) {
        StringBuilder sb = new StringBuilder();

        while(decimal > 0) {
            int lastBit = decimal&1;
            sb.insert(0, lastBit);
            decimal >>= 1;
        }
        return sb;
    }
}


public class DecimalToBinary {

    private final int num;
    public DecimalToBinary(int num){
        super();
        this.num = num;
    }

    public List<Integer> decimalToBinary(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        while (num != 0) {
            if (num % 2 == 0) {
                arr.addLast(0);
                num = num / 2;
            } else {
                arr.addLast(1);
                num = num / 2;
            }
        }
        return arr.reversed();

//        String result = "";
//        while(num > 0){
//            int rem = num % 2;
//            num = num / 2;
//            result = rem + result;
//        }
//        return result;
    }

    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a Decimal number: ");
//        int number = scanner.nextInt();
//        var startTime = System.nanoTime();
//        DecimalToBinary dto = new DecimalToBinary(number);
//        System.out.println(dto.decimalToBinary(dto.num));
//        var endTime = System.nanoTime();
//        System.out.println("Time taken to covert the number to binary system in nanoseconds: " + (endTime - startTime));

        var startTime1 = System.nanoTime();
        Converter c = new Converter();
        System.out.println(c.toBinary(10));
        var endTime1 = System.nanoTime();
        System.out.println("Time taken to covert the number to binary system in nanoseconds: " + (endTime1 - startTime1));
    }
}
