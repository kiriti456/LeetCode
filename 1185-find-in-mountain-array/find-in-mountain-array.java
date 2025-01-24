/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peakEle = findMaxIndex(mountainArr);
        int asc = binarySearchFirst(mountainArr, target, true, 0, peakEle);
        if(asc != -1)
            return asc;
        int dsc = binarySearchFirst(mountainArr, target, false, peakEle, mountainArr.length()-1);
        if(dsc != -1)
            return dsc;

        return -1;
    }

    public int findMaxIndex(MountainArray mArr){
        int l = 0, h = mArr.length()-1;
        while(l<h){
            int m = l + (h-l)/2;
            if(mArr.get(m) < mArr.get(m+1))
                l = m+1;
            else if(mArr.get(m) > mArr.get(m+1))
                h = m;
        }
        return l;
    }

    public int binarySearchFirst(MountainArray mArr, int target, boolean asc, int l, int h){
        int ans = -1;
        while(l<=h){
            int m = l + (h-l)/2;
            if(asc){
                if(mArr.get(m) < target)
                    l = m+1;
                else if(mArr.get(m) > target)
                    h = m - 1;
                else{
                    ans = m;
                    h = m-1;
                }
            }
            else{
                if(mArr.get(m) > target)
                    l = m+1;
                else if(mArr.get(m) < target)
                    h = m - 1;
                else{
                    ans = m;
                    h = m-1;
                }
            }
        }
        return ans;
    }
}