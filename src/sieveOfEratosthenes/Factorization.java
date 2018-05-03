package sieveOfEratosthenes;

import java.util.Arrays;
import java.util.Vector;

public class Factorization {

    static final int MAXN = 100001;

    // stores smallest prime factor for every number
    static int spf[] = new int[MAXN];

    static void sieve()
    {
        spf[1] = 1;
        for (int i=2; i<MAXN; i++)

            // marking smallest prime factor for every
            // number to be itself.
            spf[i] = i;

        // separately marking spf for every even
        // number as 2
        for (int i=4; i<MAXN; i+=2)
            spf[i] = 2;

        for (int i=3; i*i<MAXN; i++)
        {
            // checking if i is prime
            if (spf[i] == i)
            {
                // marking SPF for all numbers divisible by i
                for (int j=i*i; j<MAXN; j+=i)

                    // marking spf[j] if it is not
                    // previously marked
                    if (spf[j]==j)
                        spf[j] = i;
            }
        }
    }

    static Vector<Integer> getFactorization(int x)
    {
        Vector<Integer> ret = new Vector<>();
        while (x != 1)
        {
            ret.add(spf[x]);
            x = x / spf[x];
        }
        return ret;
    }

    public static void main(String[] args) {
        sieve();
        System.out.println(Arrays.toString(spf));
        int x = 12246;
        System.out.print("prime factorization for " + x + " : ");

        // calling getFactorization function
        Vector <Integer> p = getFactorization(x);

        for (int i=0; i<p.size(); i++)
            System.out.print(p.get(i) + " ");
        System.out.println();
    }

}
