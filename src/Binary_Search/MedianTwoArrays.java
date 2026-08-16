package Binary_Search;

public class MedianTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] A = {2, 3, 4, 11};
//        int[] B = {1, 5, 9, 15, 20};

        // int[] A = {1, 4, 7, 10, 12};
        // int[] B = {2, 3, 6, 15, 22, 25, 30};

        int len1 = nums1.length;
        int len2 = nums2.length;
        int total = len1+len2;
        int half = total/2;

        if (len1<len2){
            int[] temp = nums2;
            nums2 = nums1;
            nums1 = temp;

            int templen = len2;
            len2 = len1;
            len1 = templen;

        }

        int l = 0;
        int r = len2;
        int mid1 = 0;
        int mid2 = 0;
        int left1=0;
        int right1=0;
        int left2=0;
        int right2=0;
        while (l<=r){
            mid1 = l+(r-l)/2;
            mid2 = half - mid1;
            left1 = (mid2<0)?Integer.MIN_VALUE:nums1[mid2-1];
            right1 = (mid2>=len1)?Integer.MAX_VALUE:nums1[mid2];
            left2 = (mid1<0)?Integer.MIN_VALUE:nums2[mid1-1];
            right2 = (mid1>=len2)?Integer.MAX_VALUE:nums2[mid1];
            if (right1<left2){
                r=mid1-1;
            }
            else if (left1>right2){
                l=mid1+1;
            }
            else {
                break;
            }


        }
        if (total%2==0){
            return (Math.max(left1,left2)+Math.min(right1,right2))/2.0;

        }
        else {
            return Math.min(right1,right2);
        }


    }
}
