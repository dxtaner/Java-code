public class ArrayDuplicateEvenNumbers {

    static boolean isFind(int[] arr,int value){
        for (int i: arr){
            if(i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,9,1,4,2,1,2};
        int[] duplicate = new int[arr.length];
        int index=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                for(int j=0; j<arr.length; j++){
                    if( i != j && arr[i] == arr[j]){
                        if(!isFind(duplicate,arr[i])){
                            duplicate[index++]=arr[i];
                        }
                        break;
                    }
                }
            }
        }

        System.out.print("Tekrar eden cift elemanlar: ");
        printToDublicate(duplicate);
        //System.out.println(Arrays.toString(duplicate));

    }

    private static void printToDublicate(int[] duplicate) {
        for (int value : duplicate)
        {
            if(value!=0){
                System.out.print(value+" ");
            }
        }
    }
}
