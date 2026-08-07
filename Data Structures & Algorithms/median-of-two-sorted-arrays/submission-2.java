class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] =new int [nums1.length + nums2.length];

        // copy 1st array 
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
        }
        // copy 2nd array
        for(int i=0;i<nums2.length;i++){
            arr[nums1.length+ i]=nums2[i];
        }

        //sort array

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               if( arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               }
            }
        }

        int length=arr.length;
        if(length %2 != 0){
            return arr[length/2];
        }else{
            int mid1=arr[length/2-1];
            int mid2=arr[length/2];
            return (mid1+mid2)/2.0;
        }
    }
}
