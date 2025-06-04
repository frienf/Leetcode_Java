class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length()-1;
        int space=0;
        while(n>=0){
            if(s.charAt(n)!=' '){
                space++;
            }
            else if(space>0) {
                break;
            }
            n--;
        }
        return space;
    }
}