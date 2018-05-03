package timeComplexity;

public class FrogJmp {

    public int solution(int X, int Y, int D) {

        // consider exception case that mod equals zero.
        int diff = Y - X;
        return diff % D == 0 ? diff/D : diff/D+1;

    }

}
