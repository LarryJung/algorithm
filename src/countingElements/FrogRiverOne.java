package countingElements;

import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {

    // 100 solution
    public int solution(int X, int[] A) {

        Set<Integer> walks = new HashSet<>();

        for (int i = 0; i < A.length; i++) {
            walks.add(A[i]);
            if (walks.size() == X) return i;
        }
        return -1;

    }

}
