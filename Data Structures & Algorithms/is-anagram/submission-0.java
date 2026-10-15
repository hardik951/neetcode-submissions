class Solution {
    public boolean isAnagram(String s, String t) {
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap <Character, Integer> map1 = new HashMap<>();
        HashMap <Character, Integer> map2 = new HashMap<>();
        for(int i = 0; i < arr1.length; i++){
            if(!map1.containsKey(arr1[i])){
                map1.put(arr1[i],1);
            }
            else map1.put(arr1[i],map1.get(arr1[i])+1);
        }

        for(int i = 0; i < arr2.length; i++){
            if(!map2.containsKey(arr2[i])){
                map2.put(arr2[i],1);
            }
            else map2.put(arr2[i],map2.get(arr2[i])+1);
        }
        if(map2.equals(map1)){
            return true;
        }
        return false;
    }
}
