class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();

        HashMap<Integer , Integer> map = new HashMap<>();

        for(int current : nums2){
            while(!stack.isEmpty() && current > stack.peek()){
                map.put(stack.pop() , current);
            }
            stack.push(current);            
        }

        while(!stack.isEmpty()){
            map.put(stack.pop() , -1);
        }

        int answer[] = new int[nums1.length];

        for(int i=0 ; i<nums1.length ; i++){
            answer[i] = map.get(nums1[i]);
        }
        return answer;        
    }
}