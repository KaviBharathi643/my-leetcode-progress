class Solution {
public int[] intersect(int[] nums1, int[] nums2)        {
ArrayList<Integer> al=new ArrayList<>();

        for(int i:nums1){
            int k=0;
            for(int j:nums2){
                if(i==j){
                    al.add(i);
                    k=1;
                    
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