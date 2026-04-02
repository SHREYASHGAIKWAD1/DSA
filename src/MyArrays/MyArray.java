package MyArrays;

public class MyArray {

    private int[] items;
    private int currentIndex;

    public MyArray(int initialSize) {
        this.items = new int[initialSize];
        this.currentIndex = 0;
    }

    public void insert(int value) {
        if(currentIndex == items.length){
            int[] temp = new int[items.length * 2];
            for(int i = 0; i < currentIndex; i++) {
                temp[i] = items[i];
            }
            items = temp;
        }
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

        if(index >=  this.currentIndex) throw new IllegalArgumentException();

        for(int i = index; i <= this.currentIndex - 2; i++) {
            this.items[i] = this.items[i + 1];
        }
        this.currentIndex--;
        this.items[this.currentIndex] = 0;
    }

    public int max() {

        if(this.items.length == 0) throw new RuntimeException("Array is Empty!");
        int result = 0;

        for(int i=0; i<this.currentIndex; i++) {
            if(this.items[i] > result) {
                result = this.items[i];
            }
        }
        return result;
    }

    public int min() {
        int result = Integer.MAX_VALUE;

        for(int i=0; i<this.currentIndex; i++) {
            if(this.items[i] < result) {
                result = this.items[i];
            }
        }
        return result;
    }

    public void reverse() {
        int i = 0;
        int j = this.currentIndex - 1;

        while(i < j) {
            int temp = this.items[i];
            this.items[i] = this.items[j];
            this.items[j] = temp;
            i++;
            j--;
        }
    }

    public String toString() {
       StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < this.currentIndex; i++) {
            str.append(items[i]).append(", ");
        }
        str.append("\b").append("\b").append("]");
        return str.toString();
    }
}