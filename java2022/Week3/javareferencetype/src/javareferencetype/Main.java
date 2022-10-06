package javareferencetype;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 		  //int,double,String değer tiptir.  
		  int num1=10;
		  int num2=20;

		  num1=num2;
		  num2=100;

		  System.out.println(num1);

		  //Diziler,classlar ve interfaceler referans tiptir.
		  int[] nums1 = new int[]{1,2,3};
		  int[] nums2 = new int[]{10, 20, 30};

		  nums1 = nums2;
		  nums2[0]=1000;
        
		  System.out.println(nums1[0]);
	}

}
