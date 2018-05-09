package stacksAndQueues;

public class Nesting {

    // 100, O(N)
    public int solution(String S) {

        // empty exception handling
        if (S.length() == 0) return 1;
        // '))((' case
        if (S.charAt(S.length()-1) == '('  || S.charAt(0) == ')') return 0;

        int cnt = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(') {
                cnt++;
            }
            if (S.charAt(i) == ')') {
                // '())()(()' case
                if (cnt == 0) return 0;
                cnt--;
            }
        }
        return cnt == 0? 1 : 0;
    }

}
