class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];//9-2=7 9-7=2
            if (map.containsKey(complement)) {//contains 7..no  contains 2..yes
                return new int[] {map.get(complement)+1, i+1};//get(2) ie (index of 2)+1 , 1+1 ie 1,2
            }
            else {
                map.put(numbers[i], i);//if not present then the number into the map ie 2 at index 0
            }
        }
        return null;
    }
}