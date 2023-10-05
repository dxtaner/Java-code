package Thread;

import java.util.ArrayList;

public class Thread2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            numbers.add(i);
        }

        // Tek ve çift sayıları tutacak iki ayrı ArrayList oluştur
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        // ArrayList'i 4 parçaya böl
        ArrayList<ArrayList<Integer>> dividedLists = splitArrayList(numbers, 2500);

        // Thread'leri başlat ve çalıştır
        ArrayList<Thread> threads = new ArrayList<>();
        for (ArrayList<Integer> chunk : dividedLists) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    ArrayList<Integer> localEvenNumbers = new ArrayList<>();
                    ArrayList<Integer> localOddNumbers = new ArrayList<>();

                    for (int num : chunk) {
                        if (num % 2 == 0) {
                            // Çift sayıları ilgili ArrayList'e ekle
                            localEvenNumbers.add(num);
                        } else {
                            // Tek sayıları ilgili ArrayList'e ekle
                            localOddNumbers.add(num);
                        }
                    }

                    // Kritik bölgeye girerek sonuçları ana ArrayList'lere ekleyin
                    synchronized (evenNumbers) {
                        evenNumbers.addAll(localEvenNumbers);
                    }
                    synchronized (oddNumbers) {
                        oddNumbers.addAll(localOddNumbers);
                    }
                }
            });
            threads.add(thread);
            thread.start();
        }

        // Thread'lerin işini bitirmesini bekleyin
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Tek ve çift sayıları yazdır
        System.out.println("Çift Sayılar:");
        for (int even : evenNumbers) {
            System.out.print(even + " ");
        }
        System.out.println("\n\nTek Sayılar:");
        for (int odd : oddNumbers) {
            System.out.print(odd + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> splitArrayList(ArrayList<Integer> list, int chunkSize) {
        ArrayList<ArrayList<Integer>> chunks = new ArrayList<>();
        for (int i = 0; i < list.size(); i += chunkSize) {
            int end = Math.min(list.size(), i + chunkSize);
            ArrayList<Integer> chunk = new ArrayList<>(list.subList(i, end));
            chunks.add(chunk);
        }
        return chunks;
    }
}
