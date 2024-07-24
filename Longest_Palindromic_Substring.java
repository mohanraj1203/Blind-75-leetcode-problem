import java.util.*;
class Longest_Palindromic_Substring{
	
	static String longestPalindrome(String s) {
        if(s.length() == 0)
            return "";

        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){
            int odd=ischeck(s,i,i);
            int even=ischeck(s,i,i+1);

            int max_len=Math.max(odd,even);

            if(max_len > end - start){
                start=i-(max_len - 1)/2;
                end=i+max_len/2;
            }
        }
        return s.substring(start,end+1);
    }
	
    static int ischeck(String s,int left,int right){
        while(left > -1 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		
		System.out.println(longestPalindrome(str));
	}
}