package arrays;

import java.util.Arrays;

public class OddOccurencesInArray {

    // 66/80/50 solution 왜 정답이 아닌지 잘 모르겠다.
    public int solution1(int[] A) {

        if (A.length == 1) return A[0];
        Arrays.sort(A);
        if (A[0] != A[1]) return A[0];
        if (A[A.length-2]!= A[A.length-1]) return A[A.length-1];

        //System.out.println(Arrays.toString(A));

        for (int i = 1; i < A.length-1; i++) {
            if ((A[i-1] != A[i]) && (A[i] != A[i+1])) {
                return A[i];
            }
        }

        return -1;
    }

    // 100 / use XOR binary operator
    public int solution2(int[] A) {

        int elem = 0;
        for (int a : A) {
            elem ^= a;
        }
        return elem;
        // write your code in Java SE 8
    }

}
