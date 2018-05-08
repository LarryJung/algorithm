package prefixSums;

public class MinAvgTwoSlice {

    // 100, O(N)
    public int solution(int[] A) {

        int[] preSums = new int[A.length + 1];

        for (int i = 1; i < A.length+1; i++) {
            preSums[i] = preSums[i-1] + A[i-1];
        }

        double min = 1000000000;
        int index = 0;
        for (int i = 1; i < preSums.length-2; i++) {
            double twoSummation = (double)(preSums[i+1]-preSums[i-1])/2;
            double threeSummation = (double)(preSums[i+2]-preSums[i-1])/3;

            if (min > twoSummation) {
                min = twoSummation;
                index = i;
            }
            if (min > threeSummation) {
                min = threeSummation;
                index = i;
            }

        }

        if (min > (double)(A[A.length-1]+A[A.length-2])/2) {
            return A.length-2;
        }
        return index - 1;
    }

}
