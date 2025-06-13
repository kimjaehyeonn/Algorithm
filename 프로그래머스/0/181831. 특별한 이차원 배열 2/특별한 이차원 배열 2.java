class Solution {
    public int solution(int[][] arr) {
        int count = 0;
        for(int i =0; i<arr.length; i++ ){
            for (int j = 0; j <arr[0].length; j++) {
                if (arr[i][j]== arr[j][i]) count++;
            }
        }
        return count == arr.length * arr.length ? 1 :0;
    }
}