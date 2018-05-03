package sieveOfEratosthenes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorization2 {

    // sieve O(N(loglogN))
    public static int[] seive(int n) {

        int[] seiveFactors = new int[n+1];
        int i = 2;
        while (i*i <= n) {
            if (seiveFactors[i] == 0) {
                int k = i*i;
                while(k <= n) {
                    if (seiveFactors[k] == 0) {
                        seiveFactors[k] = i;
                    }
                    k += i;
                }
            }
            i++;
        }
        // which have value 0 is prime number under input
        return seiveFactors;
    }

    public static int[] seiveToindexes(int[] seiveFactors) {
        int[] indexes = new int[seiveFactors.length];
        for (int i = 2; i < seiveFactors.length; i++) {
            if (seiveFactors[i] == 0) {
                indexes[i] = i;
            } else {
                indexes[i] = seiveFactors[i];
            }
        }
        return indexes;
    }

    public static List<Integer> factorization(int n) {
        int[] seives = seiveToindexes(seive(n));
        List<Integer> result = new ArrayList<>();
        int i = n;
        while(i != 1) {
            result.add(seives[i]);
            i = i/seives[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 12246;
        System.out.println(Arrays.toString(seiveToindexes(seive(x))));
        System.out.println(factorization(x)); // 2, 3, 13, 157

    }

}
