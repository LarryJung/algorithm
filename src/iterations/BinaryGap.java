package iterations;

// https://app.codility.com/demo/results/trainingN9X8S4-YPW/
public class BinaryGap {

    public int solution(int N) {

        int max = 0;
        int q = N;
        int cnt = 0;

        // protect tailing zeros
        for (int i = 0; i < N; i++) {
            if (q%2 == 1) {
                break;
            } else {
                q = q/2;
            }
        }

        while(q != 1) { // end condition
            // when it comes to '1', cnt is initialized
            if (q%2 == 1) {
                cnt = 0;
            } else {
                // when mod equals zero, increase count
                cnt++;
            }
            max = Math.max(cnt, max);
            q = q/2;
        }

        return max;
    }

}
