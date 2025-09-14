public class MedianOf2SortedArray {
    public static void main(String[] args){
        int[] nums1 = {2, 4, 6};
        int[] nums2 = {1,3,5};
        double ans = median(nums1,nums2);
        System.out.println(ans);
    }
    static double median(int[] nums1,int[] nums2){
        int[] nums3 = new int[nums1.length + nums2.length];
        int i1 = 0;
        int i2 = 0;
        int i = 0;
        while(i1 < nums1.length && i2 < nums2.length){
            if(nums1[i1] < nums2[i2]){
                nums3[i++] = nums1[i1++];
            }
            else{
                nums3[i++] = nums2[i2++];
            }
        }
        while(i1 < nums1.length) nums3[i++] = nums1[i1++];
        while(i2 < nums2.length) nums3[i++] = nums2[i2++];
        int n = nums3.length;
        if(nums3.length%2 == 1){
            return (double) nums3[n/2];
        }
        else{
            return (nums3[n/2 - 1] + nums3[n/2]) / 2.0;
        }
    }
}
