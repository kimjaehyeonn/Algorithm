import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer= 0;
        // 1단계: 빈도수 카운트
        Map<Integer, Integer> frequency = new HashMap<>();
        int[] dice = {a, b, c, d};
        
        for (int num : dice) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        
        // 2단계: 빈도수를 List로 변환 후 정렬
        List<Integer> counts = new ArrayList<>(frequency.values());
        Collections.sort(counts, Collections.reverseOrder()); // 내림차순 정렬
        
        // 3단계: 빈도수 패턴으로 케이스 분류
        // 케이스 1: 네 주사위가 모두 같음 [4]
        if (counts.equals(Arrays.asList(4))) {
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 4) {
                    int p = entry.getKey();
                    answer=  1111 * p;
                }
            }
        }
        
        // 케이스 2: 세 개가 같고 하나가 다름 [3, 1] 
        else if (counts.equals(Arrays.asList(3, 1))) {
            int p = 0, q = 0;
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 3) {
                    p = entry.getKey();  // 3번 나온 숫자
                } else if (entry.getValue() == 1) {
                    q = entry.getKey();  // 1번 나온 숫자
                }
            }
            answer=  (10 * p + q) * (10 * p + q);  // (10p + q)²
        }
        
        // 케이스 3: 두 개씩 같음 [2, 2]
        else if (counts.equals(Arrays.asList(2, 2))) {
            List<Integer> pairs = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 2) {
                    pairs.add(entry.getKey());
                }
            }
            int p = pairs.get(0);
            int q = pairs.get(1);
            answer=  (p + q) * Math.abs(p - q);
        }
        
        // 케이스 4: 한 쌍과 두 개의 다른 숫자 [2, 1, 1]
        else if (counts.equals(Arrays.asList(2, 1, 1))) {
            List<Integer> singles = new ArrayList<>();
            for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
                if (entry.getValue() == 1) {
                    singles.add(entry.getKey());
                }
            }
            answer=  singles.get(0) * singles.get(1);  // q × r
        }
        
        // 케이스 5: 모두 다름 [1, 1, 1, 1]
        else {
            List<Integer> allNumbers = Arrays.asList(a, b, c, d);
            answer = Collections.min(allNumbers);  // 최솟값
        }
        return answer;
    }
}