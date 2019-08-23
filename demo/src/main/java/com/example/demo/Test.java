package com.example.demo;

import java.util.Scanner;

public class Test {
          public static void main(String[]args) {
        	 Scanner sc=new Scanner(System.in);
        	 int num=sc.nextInt();
        	 if(num<200&&num>1) {
        		 int [] a=new int[num];
        		 for(int i=0;i<num;i++) {
        			 a[i]=sc.nextInt();
        			 if(a[i]>1000||a[i]<-1000) {
        				 
        				 return;
        				 
        			 }
        			 
        			 
        		 }
        	for(int i=0;i<a.length-1;i++) {
        		for(int j=0;j<a.length-1-i;j++) {
        			if(a[j]>a[j+1]) {
        				int temp=a[j];
        				a[j]=a[j+1];
        				a[j+1]=temp;
        				
        			}
        			
        			
        		}
        		
        		
        		
        	}	 
        		 
        		 for(int i=0;i<a.length;i++) {
        			 System.out.print(a[i]);
        			 
        			 
        		 }
        		 
        	 }
        	  
        	  
        	  
        	  
        	  
        	  
        	
        	  
        	  
                                                                          }
	
	
	
	
                         }
