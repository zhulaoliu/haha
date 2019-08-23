package com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {
       public static void main(String[] args) {
   		Scanner sc=new Scanner(System.in);
    	             int number=sc.nextInt();
    	             int pass=sc.nextInt();
    	            login(number,pass);
                  
                    
                    
                    
       }
	
       public static void login(int number,int pass) {
    	   if(number==1001&&pass==123) {
    		   money();
    		   
    	   }else {
    		   System.out.print("请输入正确账号密码");
    		   return ;
    	   }
    	   
    	   
       }
	public static void money() {
		Scanner sc=new Scanner(System.in);
		  System.out.print("请输入您的银行卡号");
          card card=new card();
          card.setCno(sc.nextInt());
          System.out.print("请输入您要存的钱数");
          int b=sc.nextInt();
          int money=card.getMoney();
          money+=b;
          card.setMoney(money);
          System.out.print("您的余额:"+card.getMoney());
          System.out.print("请输入您要取的钱数");
          int b1=sc.nextInt();
          int money1=card.getMoney();
          money1-=b1;
          card.setMoney(money1);
          System.out.print("您的余额:"+card.getMoney());
          
		
	}
}
