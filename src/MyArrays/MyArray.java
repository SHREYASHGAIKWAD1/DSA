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

    //Linear search
    public int indexOf(int value) {
        for(int i = 0; i <this.currentIndex; i++) {
            if(this.items[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public void removeAt(int index) {

        for(int i = index; i <= this.currentIndex - 2; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.currentIndex--;
        this.items[this.currentIndex] = 0;
    }

    public String toString() {
       StringBuilder str = new StringBuilder();
        str.append("[");
        for (int nums: this.items) {
            str.append(nums).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
}