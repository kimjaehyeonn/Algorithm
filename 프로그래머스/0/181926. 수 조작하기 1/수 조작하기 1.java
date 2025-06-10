class Solution {
    public int solution(int n, String control) {
        char[] c = control.toCharArray();;
        for(int i=0; i<c.length; i++) {
            switch(c[i]){
                case 'w':
                    n +=1;
                    break;
                case 's':
                    n -= 1;
                    break;
                case 'd':
                    n += 10;
                    break;
                case 'a':
                    n -=10;
                    
            }
        }
        return n;
    }
}