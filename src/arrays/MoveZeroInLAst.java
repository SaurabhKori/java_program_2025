package arrays;
//Given an array of integer ,write a function to move all 0's to end of it while maintaining the relative order of the non zero elements
public class MoveZeroInLAst {
	public static void main(String arg[]) {
		Print.print(moveZero(new int [] {1,0,23,0,2,13,0}));
	}
  public static int[] moveZero(int []arr) {
	  int j=0;
	  for(int i =0;i<arr.length;i++) {
		  System.out.println(i+"  "+j);
		  if(arr[i]!=0 && arr[j]==0) {
//			  System.err.println("--------");
//			  System.out.println(arr[i]+"  "+arr[j]);
			 int  temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
//			  System.err.println("--------");
		  }
		  if(arr[j]!=0) {
			  j++;
		  }
	  }
	  return arr;
  }

}
