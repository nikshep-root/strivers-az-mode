public class Palindrome {
    public static void main(String[] args){
        String str = "LeetCode";
        boolean ans = check(str);
        System.out.println(ans);
    }
    static boolean check(String str){
        int j = str.length()-1;
        String
        
        s = new String[str.length()];
        for(int i = 0 ;i < str.length();i++){
            char ch = str.charAt(i);
            s[j--] = str.charAt(i); 
        }
        if(s == str){
            return true;
        }
        return false;
    }
}
