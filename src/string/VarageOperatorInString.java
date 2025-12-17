package string;

public class VarageOperatorInString {
 public static int sum(int ...a) {
	 int sum=0;
	 for(int num:a) {
		sum=sum+num; 
	 }
	 return sum;
 }
 
 public static void main(String[] args) {
	System.err.println(sum(1,2,2,4));
}
}
