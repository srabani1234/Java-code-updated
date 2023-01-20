package Array;
//https://www.youtube.com/watch?v=4EiTF5wnqpE
public class findMinimumContiguiosSubarray {
	
	public static int minSubArraySum(int[] arr) {
		int curMax = 0;
		int max=0;
		int start=0;
		int end=0;
		int holIndex=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(i==0) {
				curMax=arr[i];
				max=curMax;
				continue;
			}
			curMax=curMax+arr[i];//3,2-3=-1/-3-4=-7
			
			if(curMax>arr[i]) {//-1>-3,-7>-4
				
				curMax=arr[i];//2,//-3
				holIndex=i;//1,2
				
			}
			
			if(curMax<max) {//-7<1
				
				max=curMax;//-7
				start=holIndex;//2
				end=i;//3
			}
			
		}
		System.out.print(max+" "+start+" "+end);
		return max;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] arr =  {1, 2, -3, -4, -18,0, 6, 7, 8, 9};
		int[] arr= {-3,-4,6,7,8,9,-1};
		minSubArraySum(arr);

	}

}
