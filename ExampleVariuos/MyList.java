import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<T> {
    private Object[] array;
    private int size;
    private int capacity;

    public MyList() {
        this.capacity = 10;
        this.array = new Object[capacity];
        this.size = 0;
    }

    public MyList(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(T data) {
        if (size == capacity) {
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        return (T) array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        T removedItem = (T) array[index];

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;

        return removedItem;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
        array[index] = data;
    }

    public int indexOf(T data) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size - 1; i >= 0; i--) {
            if (array[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T[] toArray() {
        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), size);
        System.arraycopy(array, 0, result, 0, size);
        return result;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || start >= size || finish < 0 || finish >= size || start > finish) {
            throw new IllegalArgumentException("Invalid range");
        }

        MyList<T> subList = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++) {
            subList.add(get(i));
        }
        return subList;
    }

    public boolean contains(T data) {
        return indexOf(data) != -1;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("Capacity of the list: " + list.getCapacity());
        System.out.println("Size of the list: " + list.size());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Capacity of the list: " + list.getCapacity());

        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(100);
        list.add(110);

        System.out.println("Size of the list: " + list.size());
        System.out.println("Capacity of the list: " + list.getCapacity());

        System.out.println("Contents of the list: " + list.toString());

        list.remove(3);
        System.out.println("Contents of the list (Element 40 removed): " + list.toString());

        list.set(2, 35);
        System.out.println("Contents of the list (Element at index 2 changed to 35): " + list.toString());

        System.out.println("Index of 30: " + list.indexOf(30));
        System.out.println("Last index of 70: " + list.lastIndexOf(70));
        System.out.println("Is the list empty? " + list.isEmpty());

        Integer[] array = list.toArray();
        System.out.println("List as an array: " + Arrays.toString(array));

        list.clear();
        System.out.println("List cleared. Is the list empty? " + list.isEmpty());

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);

        MyList<Integer> subList = list.sublist(2, 5);
        System.out.println("Sublist: " + subList.toString());

        System.out.println("Does the list contain 40? " + list.contains(40));
        System.out.println("Does the list contain 100? " + list.contains(100));
    }
}
