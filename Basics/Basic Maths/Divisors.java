import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int[] ans = check(num);
        System.out.println(Arrays.toString(ans));
    }
    static int[] check(int num) {
        ArrayList<Integer> div = new ArrayList<>();
        for(int i = 1; i <= Math.sqrt(num); i++) {
            if ((num % i) == 0) {
                div.add(i);
                if(i != num / i) {
                    div.add(num / i);
                }
            }
        }
        int[] arr = new int[div.size()];
        for (int i = 0; i < div.size(); i++) {
            arr[i] = div.get(i);
        }
        return arr;
    }
}   