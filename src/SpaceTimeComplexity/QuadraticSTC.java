package SpaceTimeComplexity;

public class QuadraticSTC {
    public static void main(String[] args) {
        int[] arr = {3,4,5,10,0,5,6,25,30};
        int target = 10;

        for (int i = 0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Pair: " + arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
