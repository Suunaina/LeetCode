class Solution {
    public void reverseString(char[] s) {
        char ans[] = new char[s.length];
        int index=s.length-1;
        for(int i=0 ; i<s.length; i++){
            ans[index] = s[i];
            index--;
        }   
        for(int i=0 ; i<s.length; i++){
            s[i] = ans[i];            
        }
    }
}
