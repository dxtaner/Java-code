
public class FindNumber {
	
	public static void main(String[] args) {

	int[] numbers1 = {1,2,4,44,-8,225,5,7,9,0};
	int findingNumber = 44;
	boolean isA = false;
	for (int i : numbers1) {
		if(findingNumber == i) {
			isA=true;
		}
	}
	if(isA)
		System.out.println("The number exist");
	else
		System.out.println("The number not exist");
	}
}