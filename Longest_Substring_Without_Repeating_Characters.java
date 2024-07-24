import java.util.*;
class Longest_Substring_Without_Repeating_Characters{
	
	public static boolean check(String str){
		for(int i=0;i<str.length();i++)
			for(int j=i+1;j<str.length();j++)
				if(str.charAt(i) == str.charAt(j))
					return true;
		return false;
	}
	
	public static int calculate_count(String str){
		int max=0;
		for(int i=0;i<str.length();i++){
			int count=0;
			StringBuffer temp=new StringBuffer();
			temp.append(str.charAt(i));
			for(int j=i+1;j<str.length();j++){
				temp.append(str.charAt(j));
				if(str.charAt(i) == str.charAt(j) || check(temp.toString()))
					break;
				count++;
			}
			max=Math.max(max,count);
			if(max > 90)
				return max;
		}
		return max;
	}
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String str=obj.nextLine();
		System.out.println(calculate_count(str));
	}
}