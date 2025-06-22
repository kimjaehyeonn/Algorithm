import java.util.*;

public class Solution {
    public static List<Integer> solution(int l, int r) {
        Queue<String> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        queue.offer("5");

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            int num = Integer.parseInt(curr);

            if (num > r) continue;
            if (num >= l) result.add(num);

            queue.offer(curr + "0");
            queue.offer(curr + "5");
        }

        if (result.isEmpty()) result.add(-1);
        Collections.sort(result);
        return result;
    }
}
