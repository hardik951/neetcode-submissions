class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList <Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int num = nums.length / 3;
        for(int i : map.keySet()){
            if(map.get(i) > num){
                list.add(i);
            }
        }
        return list;
    }
}