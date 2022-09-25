
public class recapDemo2 {
	
	public static void main(String[] args) {
	 double[] myList = {32.2, 33.3, 55.4, 5445.78, 408.1};
     double total = 0;
     double max = myList[0];
     for (double number : myList) {
         if (max < number){
             max=number;   
         }
         total = total + number;
         System.out.println(number);
     }
     System.out.println("Toplam: " + total);
     System.out.println("En büyük sayı: "+max);
	}
}