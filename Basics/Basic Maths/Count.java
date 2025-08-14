import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        int ans = solve(num);
        System.out.println(ans);
    }
    static int solve(int num) {
        int count = 0;
        while(num > 0) {
            count = count + 1;
            num = num / 10;
        }
        return count;
    }

}
