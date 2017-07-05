
public class TeemoAttacking {

    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int totaltime=0;
        int diff;
    	for (int i = 0; i < timeSeries.length-1; i++) {
			diff=timeSeries[i+1]-timeSeries[i];
			if (diff<duration){
				totaltime+=diff;
			}
			else{
				totaltime+=duration;
			}
		}
    	if (timeSeries.length>0)
    		totaltime+=duration;
    	return totaltime;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] timeSeries={1,4};
		System.out.println(findPoisonedDuration(timeSeries, 3));
		
		timeSeries=new int[]{1,2};
		System.out.println(findPoisonedDuration(timeSeries, 3));
	}

}
