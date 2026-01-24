package SpaceTimeComplexity;

public class Constant { //O(1)
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //Add 10 to the first element of the array above
        arr[0] += 10; //Time C. -> O(1)
        int num = arr[arr.length -1]; //Space C. -> int(4bytes) -> O(4)

        System.out.println(arr[0]); //Time C. -> O(1)

        //O(1) + O(1) = O(2) == 0(1) // Constant Time Complexity.
        //O(4bytes) = O(1) //Constant Space Complexity.
    }
}
