package arrays;
//Given an array or String the task is to reverse the array or string
public class ReverseArray {
	public static void main(String[] args) {
	int []arr=	reverseArray(new int[]{1,2,3,4,7,23,4,5});
	System.out.println(arr);
	Print.print(arr);
//	System.out.println("\r");
	}
	public static int[] reverseArray(int[] arr) {
		int start=0;
		int end =arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	

}
