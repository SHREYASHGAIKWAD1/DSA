package MyArrays;

public class MyArray {

    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int value) {
        this.items[this.currentIndex] = value;
        this.currentIndex++;
    }

    public String toString() {
        String str = "";
        for (int nums:this.items) {
            str = str + nums + ", ";
        }
        return str;
    }
}
