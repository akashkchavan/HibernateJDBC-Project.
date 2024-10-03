package com.flipkart;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Client.FlipkartIntern;

public class App 
{
    public static void main( String[] args )
    {
    	
FlipkartIntern i = new FlipkartIntern<App>() {

	@Override
	public void user() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showallproduct() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showpraticulardetails() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void profile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public java.lang.module.Configuration con() {
		// TODO Auto-generated method stub
		return null;
	}
};
    	
    	boolean flag = true;
		
		while(flag) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice");
			System.out.println("1. login");
			System.out.println("2. Show All Product");
			System.out.println("3. Exit");
			
			int choice = sc.nextInt();
			
			switch(choice) {
			
			case 1 : i.login();
//					flag = false;
			break;
			
			case 2 : i.showproduct();
//					flag = false;
			break;
			
			default : System.out.println("Thank You");
					flag = false;
			break;
			}
          }
      }     
    }

