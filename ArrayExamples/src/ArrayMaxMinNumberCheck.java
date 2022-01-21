import java.util.Scanner;

public class ArrayMaxMinNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {15, 12, 55, 1, -1, 82, -88, 2, 0, 8};
        //10,7,50,73,
        System.out.println("Bir sayi girin:");
        int sayi = scanner.nextInt();

        System.out.println("Girilen Sayi:" + sayi);
        System.out.println("Girilen Sayidan Kucuk En Yakin Sayi: " + Minn(sayi, numbers));
        System.out.println("Girilen Sayidan Buyuk En Yakin Sayi: " + Maxx(sayi, numbers));


    }

    private static int Minn(int sayi, int[] numbers) {
        int num=numbers[0];
        int minDiff=89899;
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]<sayi){
                int diff=sayi-numbers[i];
                // System.out.println(minDiff);
                if(diff<minDiff) {
                    minDiff = diff;
                    num=numbers[i];
                }
            }
        }
        return num;
    }

    private static int Maxx(int sayi, int[] numbers) {
        int num=numbers[0];
        int minDiff=89899;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>sayi){
               int diff=numbers[i]-sayi;
                if(diff<minDiff) {
                    minDiff = diff;
                    num=numbers[i];
                }
            }
        }
        return num;
    }
}

