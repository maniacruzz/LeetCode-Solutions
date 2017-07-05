
public class SortColors {

	public static void sortColors(int[] nums) {
		//sort 0 and 1 first
		int i=0,j=0;
		while (j<nums.length){
			if (nums[j]==0){
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
			j++;
		}
		
		j=i;
		while (j<nums.length){
			if (nums[j]==1){
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
				i++;
			}
			j++;
		}
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=new int[]{1,2,1,2,0,2,0,2,1,0,0,1,2,1,0,2};
		sortColors(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
