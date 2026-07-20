class Solution {
    public int largestRectangleArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();
        int pse[] = new int[heights.length];
        int nse[] = new int[heights.length];
        int maxArea = 0;

        for(int i=0 ; i<heights.length ; i++){//to find previous smallest element for each element
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                pse[i] = -1;//for the first few elements in the array until a new greater element is added
            }
            else{
                pse[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();//to clear the stack


        for(int i=heights.length - 1 ; i>=0 ; i--){//to find next smallest element for each element
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nse[i] = heights.length;//for the last element in the array
            }
            else{
                nse[i] = stack.peek();
            }
            stack.push(i);
        }

        for(int i=0 ; i<heights.length ; i++){
            int width = nse[i] - pse[i] - 1; 
            int area = heights[i] * width;
            if(area > maxArea){
                maxArea = area;
            }   
        }  
        return maxArea; 
    }
}