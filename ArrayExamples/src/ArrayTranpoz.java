import java.util.Scanner;

public class ArrayTranpoz {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("1. boyut degeri: ");
    int n = scanner.nextInt();
    System.out.print("2. boyut degeri: ");
    int m = scanner.nextInt();
    int[][] numbers= new int[n][m];

    for(int i=0; i<n; i++){
        for(int k=0; k<m; k++){
            System.out.print(i+" "+k+" degeri girin: ");
            numbers[i][k]=scanner.nextInt();
        }
    }

    System.out.println("Dizinin orjinal hali: ");
    showArray(numbers,n,m);
    System.out.println("Dizinin tranpoz hali: ");
    tranpozArr(numbers,n,m);

    }

    public static void tranpozArr(int[][] numbers, int n, int m) {
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            for(int k=0; k<n; k++){
              arr[i][k]=numbers[k][i];
            }
        }
        showArray(arr,m,n);
    }

    public static void showArray(int[][] numbers,int n, int m) {
        for(int i=0; i<n; i++){
            for(int k=0; k<m; k++){
                System.out.print(numbers[i][k]+" ");
            }
            System.out.println();
        }
    }
}
