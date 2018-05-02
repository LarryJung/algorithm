package arrays;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {

            if (i+K >= A.length) {
                result[(i+K)%A.length] = A[i];
            } else {
                result[i+K] = A[i];
            }

        }

        return result;
        // write your code in Java SE 8
    }
}
