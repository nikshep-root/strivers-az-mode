public class CountOccurences {
    public static void main(String[] args){
        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int target = 7;
        int ans = countOccurence(arr, target);
        System.out.println(ans);
    }
    static int countOccurence(int[] arr, int target){
        int n = arr.length;
        int first = firstOccurence(arr, target, n);
        if(first == -1){
            return 0;
        }
        int last = lastOccurence(arr, target, n);
        return last-first + 1;
    }
    static int firstOccurence(int[] arr, int target,int n){
        int start = 0;
        int end = n-1;
        int first = -1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                first = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return first;
    }
    static int lastOccurence(int[] arr, int target,int n){
        int start = 0;
        int end = n-1;
        int last = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                last = mid;
                start = mid + 1;
            }
            else if (arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return last;
    }
}
