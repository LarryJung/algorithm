package sieveOfEratosthenes;

public class CountSemiPrimes {


    // O(N * log(log(N)) + M * N) or O(M * N**3) or O(M * N ** (3/2))
    // 55/100/20
    public int[] getSeive(int N) {
        int[] seive = new int[N+1];
        int i = 2;

        while(i * i <= N) {
            if (seive[i] == 0) {
                int k = i*i;
                while(k <= N) {
                    if (seive[k] == 0) {
                        seive[k] = i;
                    } else {
                    }

                    k += i;
                }
            }
            i++;
        }

        int[] indexes = new int[seive.length];
        for (int j = 2; j < seive.length; j++) {
            if (seive[j] == 0) {
                indexes[j] = j;
            } else {
                indexes[j] = seive[j];
            }
        }
        return indexes;
    }

    public boolean isFactorTwo(int n) {

        int[] seive = getSeive(n);
        //System.out.println(Arrays.toString(seive));
        int cnt = 0;
        int i = n;

        while(cnt != 2) {
            i = i/seive[i];
            cnt++;
            if (i == 1) {
                break;
            }
        }

        return i == 1 && cnt == 2 ? true : false;
    }

    public int[] solution(int N, int[] P, int[] Q) {

        int[] numbers = new int[N+1];

        for (int i = 4; i < numbers.length; i++) {
            if (isFactorTwo(i)) {
                numbers[i] = 1;
            }
        }

        int[] preSum = new int[numbers.length];

        for (int i = 1; i < numbers.length; i++) {
            preSum[i] = preSum[i-1] + numbers[i];
        }

        //System.out.println(Arrays.toString(numbers));
        //System.out.println(Arrays.toString(preSum));

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++){
            result[i] = preSum[Q[i]] - preSum[P[i]-1];
        }

        return result;
    }


}
