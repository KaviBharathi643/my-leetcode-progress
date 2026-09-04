class Solution {
public int[] intersect(int[] nums1, int[] nums2)        {
ArrayList<Integer> al=new ArrayList<>();

        for(int i=0;i<nums1.length;i++){
            int k=0;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    al.add(nums1[i]);
                    k=1;
                    nums2[j]=-1;
                }
                if(k==1){
                    break;
                }
            }
        }
int[] arr = new int[al.size()];

for (int i = 0; i < al.size(); i++) {
    arr[i] = al.get(i); 
}        return arr;
    }
}