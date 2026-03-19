package SpaceTimeComplexity;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

    private final int num;
    public DecimalToBinary(int num){
        super();
        this.num = num;
    }

    public List<Integer> decimalToBinary(int num){
        ArrayList<Integer> arr = new ArrayList<>();
        while (num!=0) {
            if(num%2==0){
                arr.addFirst(0);
                num = num/2;
            } else {
                arr.addFirst(1);
                num = num/2;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        var startTime = System.nanoTime();
        DecimalToBinary dto = new DecimalToBinary(50);
        System.out.println(dto.decimalToBinary(dto.num));
        var endTime = System.nanoTime();
        System.out.println("Time taken to covert the number to binary system in nanoseconds: " + (endTime - startTime));
    }
}
