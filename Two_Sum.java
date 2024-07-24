import java.util.*;
class Two_Sum{
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		int[] arr=new int[str.length];
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		int target=obj.nextInt();
		
		for(int i=0;i<str.length;i++)
			for(int j=i+1;j<str.length;j++)
				if(arr[i]+arr[j] == target){
					System.out.println(i+" "+j);
					return;
				}
		System.out.println(-1+" "+-1);
	}
}