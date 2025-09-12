public class BookAllocation {
    public static void main(String[] args){
        int[] nums = {12, 34, 67, 90};
        int m = 2;
        int ans = findPages(nums,m);
        System.out.println(ans);
    }
    static int findPages(int[] nums, int m){
        int low = max(nums);
        int high = sum(nums);
        for(int i = low ; i <= high; i++){
            int cntStu = find(nums, i);
            if(cntStu == m){
                return i;
            }
        }
        return -1;
    }
    static int max(int[] nums){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            if(nums[i] > maxi){
                maxi = nums[i];
            }
        }
        return maxi;
    }
    static int sum(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
    static int find(int[] nums, int pages){
        int stu = 1;
        int pagesStudent = 0;
        for(int i = 0; i < nums.length; i++){
            if(pagesStudent + nums[i] <= pages){
                pagesStudent += nums[i];
            }
            else{
                stu++;
                pagesStudent = nums[i];
            }
        }
        return stu;
    }
}
