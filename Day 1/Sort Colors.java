class Solution {
    public void sortColors(int[] nums) {
        int ones = 0,twos = 0,zeros = 0;
        for(int num:nums){
            if(num==1) ones++;
            else if(num==2) twos++;
            else zeros++;
        }
        for(int i=0;i<nums.length;i++){
            if(zeros>0){
                nums[i] = 0;
                zeros--;
            } 
            else if(ones>0){
                nums[i] = 1;
                ones--;
            } 
            else{
                nums[i] = 2;
                twos--;
            }
        }
    }
}