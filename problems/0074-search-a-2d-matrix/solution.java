class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rl=matrix[0].length-1;
        int cl=matrix.length-1;
        int i=0;
        while(i<=cl){
            int mi=(i+cl)/2;
            if(matrix[mi][rl]>=target && matrix[mi][0]<=target){
                int l=0;
                int r=rl;
                while(l<=r){
                    int mid=(l+r)/2;
                    if (matrix[mi][mid]==target){
                        return true;
                    }
                    else if(matrix[mi][mid]>target){
                        r=mid-1;
                    }
                    else if(matrix[mi][mid]<target){
                        l=mid+1;
                    }
                }return false;}
                else if(matrix[mi][rl]<target){
                    i=mi+1;
                }
                else if(matrix[mi][0]>target){
                    cl=mi-1;
                }
            }return false;
        }
    }

