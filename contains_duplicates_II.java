/*Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.*/



class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int i=0;
        HashMap<Integer,Integer> h=new HashMap<>();
        for(i=0;i<nums.length;i++){
            int c=nums[i];
            if(h.containsKey(c) && i-h.get(c)<=k){
                return true;
            }
            else{
                h.put(c,i);
            }
        }
        return false;
    }
}
