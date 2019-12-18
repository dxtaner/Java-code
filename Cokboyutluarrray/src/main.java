import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// int[] a = {1,2,3,4};

		int[][] b = new int[2][2];

		b[0][1] = 10;
		System.out.println("Eleman :" + b[0][1]);

		int[][] c = { { 10, 20 }, { 30, 40 } };
		System.out.println(c[0][1]);

		int[][] array = new int[3][3];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("Elamani Girin :");
				array[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
