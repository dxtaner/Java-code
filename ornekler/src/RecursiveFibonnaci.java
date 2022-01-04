import java.util.Scanner;

public class RecursiveFibonnaci {

    static int Fibo(int a){
        if(a==1 || a==2)
            return 1;
        return  Fibo(a-1) + Fibo(a-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a:");
        int a = scanner.nextInt();
        int sonuc=Fibo(a);
        System.out.print(sonuc);


    }

}
