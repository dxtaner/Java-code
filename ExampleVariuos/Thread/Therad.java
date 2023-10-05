package Thread;
import java.util.ArrayList;

class NumberProcessor implements Runnable {
    private final ArrayList<Integer> sourceList;
    private final ArrayList<Integer> evenList;
    private final ArrayList<Integer> oddList;

    public NumberProcessor(ArrayList<Integer> sourceList, ArrayList<Integer> evenList, ArrayList<Integer> oddList) {
        this.sourceList = sourceList;
        this.evenList = evenList;
        this.oddList = oddList;
    }

    @Override
    public void run() {
        for (int number : sourceList) {
            if (number % 2 == 0) {
                synchronized (evenList) {
                    evenList.add(number);
                }
            } else {
                synchronized (oddList) {
                    oddList.add(number);
                }
            }
        }
    }
}

public class Therad {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // 1'den 10000'e kadar olan sayıları oluşturunuz.
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        int chunkSize = numbers.size() / 4;
        ArrayList<Integer> chunk1 = new ArrayList<>(numbers.subList(0, chunkSize));
        ArrayList<Integer> chunk2 = new ArrayList<>(numbers.subList(chunkSize, 2 * chunkSize));
        ArrayList<Integer> chunk3 = new ArrayList<>(numbers.subList(2 * chunkSize, 3 * chunkSize));
        ArrayList<Integer> chunk4 = new ArrayList<>(numbers.subList(3 * chunkSize, numbers.size()));

        Thread thread1 = new Thread(new NumberProcessor(chunk1, evenNumbers, oddNumbers));
        Thread thread2 = new Thread(new NumberProcessor(chunk2, evenNumbers, oddNumbers));
        Thread thread3 = new Thread(new NumberProcessor(chunk3, evenNumbers, oddNumbers));
        Thread thread4 = new Thread(new NumberProcessor(chunk4, evenNumbers, oddNumbers));

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Çift Sayılar: " + evenNumbers.size());
        System.out.println("Tek Sayılar: " + oddNumbers.size());
    }
}
