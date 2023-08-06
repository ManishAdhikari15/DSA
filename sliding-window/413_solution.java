class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
    
    int cur=0,total=0;
    if(nums.length<3){
        return 0;
    }
    for(int i=2;i<nums.length;i++){
        if(nums[i]-nums[i-1]==nums[i-1]-nums[i-2]){
            cur++;
            total+=cur;
        }
        else{
            cur=0;
        }
    }
    return total;     
      
    }
}