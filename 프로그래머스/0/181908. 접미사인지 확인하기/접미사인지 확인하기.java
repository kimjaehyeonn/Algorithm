class Solution {
    public int solution(String my_string, String is_suffix) {
        int start = is_suffix.length();
        int end = my_string.length();
        System.out.println(my_string.substring(end>=start ? end-start : 0, end));
        return my_string.substring(end>=start ? end-start : 0, end).equals(is_suffix) ? 1 : 0; 
    }
}