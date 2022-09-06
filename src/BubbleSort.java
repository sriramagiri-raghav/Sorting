//package Sorting;
public class BubbleSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,23,45,43,44,51,21,21,65,10}; 
  
	         for(int i=0;i<a.length; i++){  
	                 for(int j=1; j < (a.length-i); j++){  
	                          if(a[j-1] > a[j]){  
	                                 //swap elements  
	                                 int t = a[j-1];  
	                                 a[j-1] = a[j];  
	                                 a[j] = t;  
	                         }  
	                          
	                 }  
	         }  
	         for(int i=0;i<a.length;i++) {
	        	 System.out.print(a[i]+" ");
	         }
	}

}
