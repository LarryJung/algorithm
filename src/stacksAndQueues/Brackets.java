package stacksAndQueues;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Brackets {

    // 100, O(N)
    public int solution(String S) {

        Set<Character> opens = new HashSet<>();
        opens.add('(');
        opens.add('[');
        opens.add('{');

        Set<Character> closed = new HashSet<>();
        closed.add(')');
        closed.add(']');
        closed.add('}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < S.length(); i++) {

            char ch = S.charAt(i);

            // continue를 써줌으로써 탐색 시간 단축
            if (stack.size() == 0) {
                stack.push(ch);
                if (closed.contains(stack.peek())) return 0;
                continue;
            }

            if (opens.contains(ch)) {
                stack.push(ch);
                continue;
            }

            if (closed.contains(ch)) {
                if (ch == ')' && stack.peek() == '(') {
                    stack.pop();
                    continue;
                }
                else if (ch == ']' && stack.peek() == '[') {
                    stack.pop();
                    continue;
                }
                else if (ch == '}' && stack.peek() == '{') {
                    stack.pop();
                    continue;
                } else {
                    return 0; // 전체 루프를 돌지 않고서도 틀린 케이스를 찾아낼 수 있어야 시간 단축가능
                }

            }
        }
        return stack.size() == 0? 1 : 0;
    }

}
