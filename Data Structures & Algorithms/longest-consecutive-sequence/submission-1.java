class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer> set1 = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            set1.add(nums[i]);
        }
        int length = 0;
        int longest = 0;
        for(int n : set1){
            if(!set1.contains(n-1)){
                length = 1;
                while(set1.contains(n+1)){
                    length++;
                    n++;
                }
                if(length > longest) 
                {
                    longest = length;
                }
            }
        }
        return longest;
    }
}
