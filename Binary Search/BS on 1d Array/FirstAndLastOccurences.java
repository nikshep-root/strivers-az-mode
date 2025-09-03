public class FirstAndLastOccurences {
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int n = nums.length;
        int[] ans = new int[2];
        int first = firstIndex(nums,target,n);
        if(first == -1) {
            ans[0] = -1;
            ans[1] = -1;
            System.out.println(ans);
        }
        int last = lastIndex(nums,target,n);
        ans[0] = first;
        ans[1] = last;
        System.out.println(ans);
    }
    static int firstIndex(int[] nums,int target, int n){
        int start = 0;
        int end = n-1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                first = mid;
                end = mid - 1; 
            }
            else if(nums[mid] <= target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return first;
    }
    static int lastIndex(int[] nums,int target, int n){
        int start = 0;
        int end = n - 1;
        int last = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                last = mid;
                start = mid + 1;
            }
            else if(nums[mid] <= target){
                start = mid +1;
            }
            else{
                end = mid - 1;
            }
        }
        return last;
    }
}
