public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int ans = longestConsecutive(nums);
        System.out.println(ans);
    }
    static int longestConsecutive(int[] nums) {
        int largest = 0;
        for(int num : nums){
            int count = 1;
            int current = num;
            while(linearSearch(current+1,nums) == true){
                count += 1;
                current +=1;
            }
            if(count > largest) {
                largest = count;
            }
        }
        return largest;
    }
    static boolean linearSearch(int n, int[] nums){
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == n){
                return true;
            }
        }
        return false;
    }
}
