package ebobbulma;
import java.util.Scanner;

public class main {
	public static int ebobbulma(int a,int b){
		int ebob=1;
		
		for(int i=1; i<=a && i<=b;i++){
		
			if(a%i==0 && b%i==0){
			  ebob=i;	
			}	
		}
		return ebob;
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Bir sayi girin :");
		int a=sc.nextInt();
		System.out.println("Bir sayý girin :");
		int b=sc.nextInt();
        int c=ebobbulma(a, b);
        System.out.println("EBOB :"+c);
	}

}
