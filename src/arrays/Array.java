package arrays;

import java.util.Arrays;

public class Array<T>{
	
	int size =1;
	T [] arr=(T[])new Object[size];
	static int i=0;
   
	
	public boolean add(T a) {
		if(i==arr.length) {
			arr=Arrays.copyOf(arr, i+1);
		}
		arr[i]=a;
		i++;
	 return true;
	}
	
    public T [] toArray() {
    	return arr;
    }
    public  void display() {
  	  String a="[";
  	   for(int j=0;j<i;j++) {
  		 a=a+arr[j]+",";  
  	   }
  	 a=  a.substring(0, a.length()-1);
  	   a+="]";
  	   System.out.println(a);
  	  
    }
	public int length() {
		
		return arr.length;
	}
  public static void main(String[] args) {
	  int [] arr1=new int[] {1,2,3,4};
	  int [] arr2=new int[] {1,2,3,4,5};
	  System.arraycopy(arr1, 2, arr2, 0, 2);
	  
	  Print.print(arr2);
	Array<Integer> a=new Array();
	a.add(12);
	a.add(1);
	a.add(2);
	a.add(1);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	a.add(7);
	a.add(8);
	a.add(4);
	a.add(5);
	a.add(6);
	a.add(7);
	a.add(7);
	a.add(8);

//	a.add(10);
//	a.add(11);
	
a.display();
System.out.println(a.toArray().length);
 
	
}
	

}
