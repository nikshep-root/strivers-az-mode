import java.util.Scanner;
public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        int ans = find(num1, num2);
        System.out.println(ans);
    }
    static int find(int a , int b) {
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
