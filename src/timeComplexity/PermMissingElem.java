package timeComplexity;

public class PermMissingElem {

    public int solution(int[] A) {

        int[] check = new int[A.length+1];

        // 숫자가 있으면 1 없는 자리는 0
        for (int a : A) {
            check[a-1] = 1;
        }

        // 0인 인덱스 반환
        for (int i = 0; i < check.length; i++) {
            if (check[i] == 0) {
                return i+1;
            }
        }
        return -1;
    }

}
