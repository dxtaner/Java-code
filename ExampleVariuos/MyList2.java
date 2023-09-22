import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList2<T> {
    private Object[] array;
    private int size;
    private int capacity;

    public MyList2() {
        this.capacity = 10;
        this.array = new Object[capacity];
        this.size = 0;
    }

    public MyList2(int capacity) {
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
            // Dizi kapasitesini iki katına çıkar
            capacity *= 2;
            Object[] newArray = new Object[capacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
        array[size++] = data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Geçersiz indis: " + index);
        }
        return (T) array[index];
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            return null; // Geçersiz indis, null döndür
        }

        T removedItem = (T) array[index];

        // Silinen elemandan sonraki elemanları sola kaydır
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null; // Son elemanı null yap
        size--;

        return removedItem;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= size) {
            return; // Geçersiz indis, işlem yapma
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

    public T[] toArray(Integer[] array2) {
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

    public MyList2<T> sublist(int start, int finish) {
        if (start < 0 || start >= size || finish < 0 || finish >= size || start > finish) {
            throw new IllegalArgumentException("Geçersiz aralık");
        }

        MyList2<T> subList = new MyList2<>(finish - start + 1);
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
        MyList2<Integer> liste = new MyList2<>();
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(50);
        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        System.out.println("Dizinin İçeriği: " + liste.toString());

        liste.remove(3);
        System.out.println("Dizinin İçeriği (Eleman 40 silindi): " + liste.toString());

        liste.set(2, 35);
        System.out.println("Dizinin İçeriği (Eleman 2'de 35 ile değiştirildi): " + liste.toString());

        System.out.println("30'nun İndex'i: " + liste.indexOf(30));
        System.out.println("70'in Son İndex'i: " + liste.lastIndexOf(70));
        System.out.println("Liste Boş mu? " + liste.isEmpty());

        // Integer[] array = new Integer[liste.size()];
        // array = liste.toArray(array);
        // System.out.println("Liste Dizisi: " + Arrays.toString(array));

        liste.clear();
        System.out.println("Liste Temizlendi. Liste Boş mu? " + liste.isEmpty());

        liste.add(10);
        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);
        liste.add(60);
        liste.add(70);

        MyList2<Integer> subList = liste.sublist(2, 5);
        System.out.println("Alt Liste: " + subList.toString());

        System.out.println("Liste 40'ı İçeriyor mu? " + liste.contains(40));
        System.out.println("Liste 100'ü İçeriyor mu? " + liste.contains(100));
    }
}
