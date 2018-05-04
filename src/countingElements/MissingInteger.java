package countingElements;

public class MissingInteger {

    // O(N) or O(N * log(N))
    // 100 solution
    public int solution(int[] A) {

        int[] check = new int[1000000+1];

        for (int a : A) {
            if (a>0) {
                check[a] = a;
            }
        }

        for (int i = 1; i < 1000000+1; i++) {
            if (check[i] == 0) {
                return i;
            }
        }
        return -1;
    }

}
