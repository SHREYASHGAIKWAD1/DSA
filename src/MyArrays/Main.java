package MyArrays;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Primitive Array support
        //Arrays are static in size
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;

        //System.out.println(arr[1]);
        //System.out.println(arr);
        MyArray arr1 = new MyArray(5);

        arr1.insert(1);
        arr1.insert(2);
        arr1.insert(3);
        arr1.insert(4);
        arr1.insert(5);

        System.out.println(arr1);
    }
}
