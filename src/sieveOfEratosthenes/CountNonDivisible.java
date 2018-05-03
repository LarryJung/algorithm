package sieveOfEratosthenes;

public class CountNonDivisible {

    // 100% score
    // https://github.com/charles-wangkai/codility/blob/master/CountNonDivisible.java

    // 55/100/0
    // O(N ** 2)
    public int[] solution(int[] A) {

        int[] result = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) {
                    continue;
                }
                if (A[i] % A[j] != 0) {
                    result[i]++;
                }
            }
        }
        return result;
    }

}
