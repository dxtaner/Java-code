import java.util.Scanner;

public class ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizi boyutu girin: ");
        int boyut = sc.nextInt();
        int[] array = new int[boyut];

        for(int i=0; i<array.length; i++){
            System.out.print((i+1)+". elemani giriniz: ");
            array[i]=sc.nextInt();
        }

        System.out.print("Siralamadan onceki hal: ");
        pirntToArray(array);
        System.out.println();
        System.out.print("Siralama sonrasi hal: ");
        sorted(array);
    }

    private static void pirntToArray(int[] array) {
        for(int j=0; j<array.length; j++){
            System.out.print(array[j]+" ");
        }
    }

    public static void sorted(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        pirntToArray(array);
    }
}
