package OOP.generics;

import java.util.Arrays;
//here T should be either be Number or its subclasses
public class WildCardExample<T extends Number> {
    private Object[] data ;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

   // wildcard example
    public void getList(WildCardExample<? extends Number> list){
        //do soemthing
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)(data[--size]);  // casting required smaller and more specific type is assigning bigger type
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value; //No casting required bigger type is storing lower type
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        // throwing error -- Type parameter 'java.lang.String' is not within its bound; should extend 'java.lang.Number'
     //   WildCardExample<String> s = new WildCardExample<>();

        WildCardExample<Integer> num = new WildCardExample<>();
    }

}
