class Solution(object):
    def longestCommonPrefix(self, strs):
        l=1
        n=len(strs)
        st=strs[0]
        while(l<n ):
            if st[0:len(strs[l])]==strs[l]:
                st=strs[l]
                l+=1
            else:
                strs[l]=strs[l][0:len(strs[l])-1]
        return st

