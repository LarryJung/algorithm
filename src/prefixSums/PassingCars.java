package prefixSums;

public class PassingCars {

    public int solution(int[] A) {

        int cnt = 0;
        int passed = 0;

        for (int a : A) {
            if (a == 0) {
                cnt++;
            }
            if (a == 1) {
                passed += cnt;
                if (passed > 1000000000) {
                    return -1;
                }
            }
        }

        return passed;
        // write your code in Java SE 8
    }

}
