import java.util.*;
class Sum_3{
	
	static List<List<Integer>> find_3sum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }
        return res;
    }
	
	public static void main(String[] arg){
		Scanner obj=new Scanner(System.in);
		
		String[] str=obj.nextLine().split(" ");
		
		int[] arr=new int[str.length];
		
		for(int i=0;i<str.length;i++)
			arr[i]=Integer.parseInt(str[i]);
		
		List<List<Integer>> result=find_3sum(arr);
		
		System.out.println(result);
	}
}