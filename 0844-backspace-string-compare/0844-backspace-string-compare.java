class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> t1 = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) != '#'){
                s1.push(s.charAt(i));
            }
            else if(s.charAt(i) == '#' && !s1.isEmpty()){
                s1.pop();
            }
        }

        for(int j=0 ; j<t.length() ; j++){
            if(t.charAt(j) != '#'){
                t1.push(t.charAt(j));
            }
            else if(t.charAt(j) == '#' && !t1.isEmpty()){
                t1.pop();
            }
        }
        return s1.equals(t1);        
    }
}