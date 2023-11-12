class Solution {
    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> exist = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {


            if (exist.contains(nums[i])) {
                return true;
            }
            exist.add(nums[i]);
        }

        return false;
        
    }
}