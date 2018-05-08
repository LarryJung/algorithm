package prefixSums;

public class CountDiv {

    // 100 soultion, O(1)
    public static int solution(int A, int B, int K) {
        // write your code in Java SE 8
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }
}
