class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> hashset = new HashSet<>();
    int i = 0;
    
        
    while (i < nums.length) {
        if(!hashset.contains(nums[i])) {
            hashset.add(nums[i]);
            i++;
        }
        else {
            return true;
        }
    }
    return false;
}
}