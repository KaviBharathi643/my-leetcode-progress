import java.util.Arrays;
class Solution {
    public int missingMultiple(int[] nums, int k) {
        int m=0;
        Arrays.sort(nums);
        int ma=Arrays.stream(nums).max().getAsInt();
        for(int i=1;i<nums[nums.length-1]/k+2;i++){
            int l=0;
            int r=nums.length-1;
            int p=0;
            while(l<=r){
                int mid=(l+r)/2;
                if(nums[mid]==k*i){
                    p=1;
                    break;
                }
                else if(nums[mid]<k*i){
                    l=mid+1;
                }
                else if(nums[mid]>k*i){
                    r=mid-1;
                }

            }
            if(p==0){
                m=i;
                break;
            }
        }

return k*m;
        
    }
}