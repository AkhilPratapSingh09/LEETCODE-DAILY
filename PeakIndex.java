
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int fi=0;
        int li=arr.length-1;
        int mid=fi+(li-fi)/2;
        
        while(fi<li){
            if(arr[mid]<arr[mid+1]){
                fi=mid+1;
            }
            else{
                li=mid;
            }
         mid=fi+(li-fi)/2;
        
  
    }
              return fi;
    }

}