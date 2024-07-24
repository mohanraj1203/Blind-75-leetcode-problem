import java.util.*;
class Container_With_Most_Water{
	
	public static int calculate(int[] arr){
		int left=0,right=arr.length-1;
		int area=0;
		int max_area=0;
		while(left < right){
			int distance=right-left;
			if(arr[left] > arr[right]){
				area=arr[right];
				right--;
			}
			else{
				area=arr[left];
				left++;
			}
			area*=distance;
			max_area=Math.max(area,max_area);
		}
		return max_area;
	}
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		String[] str=obj.nextLine().split(" ");
		
		int[] arr=new int[str.length];
		
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		System.out.println(calculate(arr));
	}
}