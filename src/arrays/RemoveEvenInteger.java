package arrays;

import java.awt.Robot;

public class RemoveEvenInteger {

	public static void main(String[] args) {
	int [] arr=	removeEvenNum(new int[] {23,5,24,29,4,6,8,0,27});
	Print.print(arr);
//	System.out.println(arr.toString());
//	for(int i=0;i<arr.length;i++) {
//		System.out.print(arr[i]+",");
//	}
	}
	public static int [] removeEvenNum(int []arr) {
		int odd_count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				odd_count++;
			}
		
		}
		int [] result =new int[odd_count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
			result[j]=arr[i];
			j++;
			}
		
		}
		return result;
	}
}
