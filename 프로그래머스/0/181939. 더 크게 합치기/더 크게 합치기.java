class Solution {
    public int solution(int a, int b) {
        String as = Integer.toString(a);
        String bs = Integer.toString(b);
        int asc = Integer.parseInt(as+bs);
        int desc = Integer.parseInt(bs+as);
        return asc>=desc ? asc : desc;
    }
}