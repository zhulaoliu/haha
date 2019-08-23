package com.example.demo;

public class Test2 {
          public static void main (String []args) {
        	  
        	  int [] a= {1,2,3,4,5,8,10,};
        	  int b=find(a,8);
        	  System.out.print(b+1);
        	  
        	  
          }
	    public static int find(int []a,int key) {
	  int high=a.length-1;
	  int low=0;
	  while(low<=high) {
	  int mid=(high+low)/2;
	  if(a[mid]==key) {
		  return mid;
		  
	  }
	  else if(a[mid]>key) {
		  high=mid-1;
		  
	  }
	  else {
		  low=mid+1;
		  
	  }
              	  }
	    	return -1;
	    	
	    }
	
}
