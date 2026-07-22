class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        for(String op : operations){
            switch(op){
                case "+" : 
                    int first = stack.pop();
                    int second = stack.peek();
                    stack.push(first);
                    stack.push(first+second);
                    break;
                
                case "D" :
                    stack.push(2 * stack.peek());
                    break;
                
                case "C" :
                    stack.pop();
                    break;

                default :
                    stack.push(Integer.parseInt(op));
                    break;
            }
        }

        int score = 0;
        while(!stack.isEmpty()){
            score += stack.pop();
        }    

        return score;    
    }
}