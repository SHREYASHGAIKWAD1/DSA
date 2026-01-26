package SpaceTimeComplexity;

public class LogSTC {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,10,20,40,60,70};

        var startTime = System.nanoTime();
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 40) {
                System.out.println("Found the value 40 at index " + i);     //Inefficient solution in terms of Time C.
            }
        }
        var endTime = System.nanoTime();
        System.out.println("Linear S. took Time taken in nanoseconds: " + (endTime - startTime));

        startTime = System.nanoTime();
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(arr[mid] == 40) {
                System.out.println("[BS] Found element 40 at index " + mid);
                break;
            } else if (arr[mid] < 40) {
                start = mid + 1;
            } else  {
                end = mid - 1;
            }
        }
        endTime = System.nanoTime();
        System.out.println("Binary search took : " +  (endTime - startTime));
    }
}
