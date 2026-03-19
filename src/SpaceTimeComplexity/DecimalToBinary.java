package SpaceTimeComplexity;

import java.util.ArrayList;
import java.util.List;

public class DecimalToBinary {

    private int num;
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
        DecimalToBinary dto = new DecimalToBinary(20);
        System.out.println(dto.decimalToBinary(dto.num));
    }
}
