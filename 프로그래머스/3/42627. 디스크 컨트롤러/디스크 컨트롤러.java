import java.util.*;
class Solution {
    public int solution(int[][] jobs) {
        Arrays.sort(jobs, (j1,j2) -> j1[0]-j2[0]);
        
        Queue<int[]> pq = new PriorityQueue<>((j1,j2) -> j1[1] - j2[1]);
        
        int curTime = 0; 
        int completedJobs = 0;
        int totalResponseTime = 0;
        int jobindex =0;
        
        while ( completedJobs < jobs.length) {
            while( jobindex < jobs.length && jobs[jobindex][0] <= curTime) {
                pq.add(jobs[jobindex]);
                jobindex++;
            }
            
            if(!pq.isEmpty()) {
                int[] job = pq.remove();
                curTime += job[1];
                totalResponseTime += curTime - job[0];
                completedJobs++;
            } else{
                curTime = jobs[jobindex][0];
            }
        }
        return totalResponseTime / jobs.length;
    }
}