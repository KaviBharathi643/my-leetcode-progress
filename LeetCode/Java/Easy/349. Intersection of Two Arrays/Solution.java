class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums1){
            for(int j:nums2){
                if(i==j && !al.contains(i)){
                    al.add(i);
                }
            }
        }
int[] arr = new int[al.size()];

for (int i = 0; i < al.size(); i++) {
    arr[i] = al.get(i); 
}        return arr;
    }
}