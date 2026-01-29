package SpaceTimeComplexity;

public class LinearSTC {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //Task : Print all the elements in the array.

        for(int nums:arr) { //O(n) Time C.
            System.out.println(nums);  //O(4bytes) == O(1) --> Constant Space C.
        }

        //Add 10 to the first element of the array
        arr[0] += 10;  //O(1) Time C. | Space C. --> O(1)

        //So, Total Time C. O(n) + O(1) == O(n + 1) --> O(n) (Constants are to be ignored) - Linear Time Complexity!

        System.out.println(arr[0]); // O(1) Time C. | Space C. --> O(1)
        //Now, Tota Time C. O(n) + O(1) + O(1) == O(n + 2) --> O(n), again Linear Time Complexity!

        //As of now the Time C. is O(n) and Space C. is O(1).

        //Task - Copy the elements from one array to another.

        int[] arr1 = new int[arr.length]; // Time C. - O(1) | Space C. - O(n)

        for (int i=0; i<arr.length;i++) { // Time C. - O(n) | Space C. - O(1)
            arr1[i] = arr[i];
        }

        for(int nums: arr1) {
            System.out.println(nums);  // Time C. - O(n) | Space C. - O(1)
        }

        //Overall new Time C. and Space C. is ->
        //Space C. --> 1 + 1 + 1 + n + 1 + 1 = O(5 + n) --> O(n) (Final Space Complexity)
        //Time C. --> 1 + n + 1 + 1 + n + n = O(3 + 3n) --> O(3n) --> O(3*n) --> O(n) (Final Time Complexity)
        //Both Time C. and Space C. are Linear O(n)!

    }
}
