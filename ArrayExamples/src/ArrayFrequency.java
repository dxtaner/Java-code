public class ArrayFrequency {

    public static int[]  sorted(int[] array) {
        for(int i=0; i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] dizi={10,20,30,2,5,2,2,2,10,30,30,20};
        int[] newDizi = sorted(dizi);

        printToArray(newDizi);
        frequency(newDizi);

    }

    private static void printToArray(int[] newDizi) {
        for(int j=0; j<newDizi.length; j++){
            System.out.print(newDizi[j]+" ");
        }
        System.out.println();
    }

    private static void frequency(int[] newDizi) {
        for(int i=0; i<newDizi.length; i++){
            int count=1;
            for(int j=i+1; j<newDizi.length; j++){
                if(newDizi[i]==newDizi[j]){
                    count++;
                }
            }
            System.out.println(newDizi[i]+" sayisi "+count+" kadar tekrar edildi..");
            i+=count-1;
        }
    }
}
