package arrays;

public class MinMaxValue {
	public static void main(String[] args) {
		System.err.println(minValue(new int[] {23,6,12,9,2,24,1}));
		System.out.println(maxValue(new int[] {23,6,12,9,2,24,1}));
		System.err.println(maxValue(new int[] {23,6,12,9,2,24,31}));
	}
//find min value from array
	public static int minValue(int [] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		return min;
	}
	//find  max value from array	
	public static int maxValue(int[] arr) {
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
//find second max value from array	
	public static int secondMaxValue(int[] arr) {
		int max=arr[0];
		int secondMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				secondMax=max;
				max=arr[i];
			}else if(secondMax<arr[i] && arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		return secondMax;
	}

}
