package arrays;

import java.util.Iterator;

public class Print {
	
  public static void print(int [] arr) {
	  String a="[";
	   for(int i=0;i<arr.length;i++) {
		 a=a+arr[i]+",";  
	   }
	 a=  a.substring(0, a.length()-1);
	   a+="]";
	   System.out.println(a);
	  
  }
  public static void print(String [] arr) {
	  String a="[";
	   for(int i=0;i<arr.length;i++) {
		 a=a+arr[i]+",";  
	   }
	 a=  a.substring(0, a.length()-1);
	   a+="]";
	   System.out.println(a);
	  
  }
}
