package arrays;

import java.util.Iterator;
//find missing number in this array
public class MissingNumberInArray {
public static void main(String[] args) {
	Print.print(findMissingNum(	new int[] {1,3,4,5,7,10}));;
}
	
	public static String[] findMissingNum(int [] arr) {
	int max=MinMaxValue.maxValue(arr);
	String misnum="";
	
	for (int i = 1; i < max; i++) {
		  for (int j = 0; j < arr.length; j++) {
				 if(i !=arr[j] && j==arr.length-1) {
					misnum=misnum+i+"," ;
				 }else if(i==arr[j]) {
					 break;
				 }
		  }
		
	}
	
	return  misnum.split(",");
	}

}
