
public class ReshapeMatrix {
	public int[][] matrixReshape(int[][] nums, int r, int c) {
		if (nums==null){
			return nums;
		}
		int r_num=nums.length;
		int c_num=nums[0].length;
		
		if (r*c!=r_num*c_num){
			return nums;
		};
		int newi=0,newj=0;
		int[][] result=new int[r][c];
		
		for (int i = 0; i < r_num; i++) {
			for (int j = 0; j < c_num; j++) {
				if (newj>=c){
					newj=0;
					newi++;
				}
								
				result[newi][newj]=nums[i][j];
				
				newj++;
			}
		}
		
		
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums=new int[][]{{1,2,3,4},
								 {5,6,7,8},
								 {9,10,11,12},
								 {13,14,15,16}};
		ReshapeMatrix r = new ReshapeMatrix();
		
		int[][] res=r.matrixReshape(nums, 2, 8);
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[0].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
