class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        int answer[] = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=0 ; i<temperatures.length ; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                answer[stack.peek()] = i - stack.pop();
            }            
            stack.push(i);
        }        
        return answer;
    }
}