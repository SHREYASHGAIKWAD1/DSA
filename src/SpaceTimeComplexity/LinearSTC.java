package SpaceTimeComplexity;

public class LinearSTC {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Task : Print all the elements in the array.

        for(int nums:arr) { //O(n) Time C.
            // System.out.println(nums);  //O(4bytes) == O(1) --> Constant Space C.
        }

        //Add 10 to the first element of the array
        arr[0] += 10;  //O(1) Time C.

        //So, Total Time C. O(n) + O(1) == O(n + 1) --> O(n) (Constants are to be ignored) - Linear Time Complexity!

        System.out.println(arr[0]); // O(1) Time C.
        //Now, Tota Time C. O(n) + O(1) + O(1) == O(n + 2) --> O(n), again Linear Time Complexity!

        //As
    }
}
