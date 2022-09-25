
public class MathFunctions {
	
	 public int sum(int number1,int number2){
	        return number1+number2;
	    }
	    public int decal(int number1,int number2){
	        return number1-number2;
	    }
	    public int multiplication(int number1,int number2){
	        return number1*number2;
	    }
	    public int division(int number1,int number2){
	        if (number2==0){
	            System.out.println("hatali bolme islem!!");
	            return 0;
	        } else {
	            return number1/number2;
	        }
	    }

}
