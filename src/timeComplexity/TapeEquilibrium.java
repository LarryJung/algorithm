package timeComplexity;

public class TapeEquilibrium {

    public int solution(int[] A) {

        int len = A.length;

        int[] preSum = new int[len + 1];

        for (int i = 1; i < len+1; i++) {
            preSum[i] = preSum[i-1] + A[i-1];
        }
        int min = 1000000000;

        // index 범위에 주의 N-1번 탐색해야 한다.
        for (int P = 1; P < len; P++) {
            int split = Math.abs(2*preSum[P] - preSum[len]);
            min = Math.min(split, min);
        }
        return min;
    }

}
