import java.util.*;

class Solution {
    public int solution(int[][] points, int[][] routes) {
        int n = points.length, time = 0;
        Map<Integer, int[]> pointMap = new HashMap<>();
        for (int i = 0; i < n; i++) pointMap.put(i + 1, points[i]);

        // 각 로봇의 이동 경로를 시간순으로 저장
        List<List<int[]>> robotPaths = new ArrayList<>();
        for (int[] route : routes) {
            List<int[]> path = new ArrayList<>();
            int[] curr = pointMap.get(route[0]);
            path.add(curr.clone());

            for (int i = 1; i < route.length; i++) {
                int[] next = pointMap.get(route[i]);
                int cr = curr[0], cc = curr[1];
                int nr = next[0], nc = next[1];

                // r 먼저 이동
                while (cr != nr) {
                    cr += cr < nr ? 1 : -1;
                    path.add(new int[]{cr, cc});
                }
                // c 다음 이동
                while (cc != nc) {
                    cc += cc < nc ? 1 : -1;
                    path.add(new int[]{cr, cc});
                }
                curr = next;
            }
            robotPaths.add(path);
            time = Math.max(time, path.size());
        }

        // 시간별 위치 기록 및 위험 상황 카운트
        int risk = 0;
        for (int t = 0; t < time; t++) {
            Map<String, Integer> posMap = new HashMap<>();
            for (List<int[]> path : robotPaths) {
                int[] pos = t < path.size() ? path.get(t) : null;
                if (pos == null) continue;
                String key = pos[0] + "," + pos[1];
                posMap.put(key, posMap.getOrDefault(key, 0) + 1);
            }
            for (int cnt : posMap.values()) {
                if (cnt >= 2) risk++;
            }
        }
        return risk;
    }
}
