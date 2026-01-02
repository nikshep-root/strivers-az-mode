public class ReverseWords {
    public static void main(String[] args){
        String str = "LeetCode is a best platform for logical thinking";
        String ans = reverseWords(str);
        System.out.println(ans);
    }
    public static String reverseWords(String s) {
        s = s.trim().replaceAll("\\s+"," ");
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i >=0;i--){
            sb.append(s.charAt(i));
        }
        int i = 0;
        int j = 0;
        while(j<sb.length()){
            int ascii=(int)sb.charAt(j);
            if(ascii!=32){
                j++;
            }
            else{
                reverse(sb,i,j-1);
                i=j+1;
                j++;
            }
        }
        reverse(sb,i,sb.length()-1);
        return sb.toString();
    }
    static void reverse(StringBuilder sb,int i, int j){
        while(i<=j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
        }
    }
}
