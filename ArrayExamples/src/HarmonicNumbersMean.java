public class HarmonicNumbersMean {
    public static void main(String[] args) {
        int[] mumbers= new int[]{5, 25, 36, 4, 8};
        System.out.println("Harmonic Mean: "+ harmoncicMean(mumbers));

    }

    public static double harmoncicMean(int[] mumbers) {
        double mean=0;
        for(int i=0; i<mumbers.length; i++){
            mean+=(1.0/mumbers[i]);
        }
        return mean;
    }
}
