package NumberSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecimalToBinary {

    private final int num;
    public DecimalToBinary(int num){
        super();
        this.num = num;
    }

    public String decimalToBinary(int num){
//        ArrayList<Integer> arr = new ArrayList<>();
//        while (num!=0) {
//            if(num%2==0){
//                arr.addLast(0);
//                num = num/2;
//            } else {
//                arr.addLast(1);
//                num = num/2;
//            }
//        }
//        return arr.reversed();

        String result = "";
        while(num > 0){
            int rem = num % 2;
            num = num / 2;
            result = rem + result;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        int number = scanner.nextInt();
        var startTime = System.nanoTime();
        DecimalToBinary dto = new DecimalToBinary(number);
        System.out.println(dto.decimalToBinary(dto.num));
        var endTime = System.nanoTime();
        System.out.println("Time taken to covert the number to binary system in nanoseconds: " + (endTime - startTime));
    }
}
