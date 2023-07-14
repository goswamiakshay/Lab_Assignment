package Akshay;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
//		initializing variable
		int i, num, ans;
		Scanner sc = new Scanner(System.in);
		
//		message for user
		System.out.println("enter the number you want to table : ");
		num = sc.nextInt();
		
		
//		print table from for loop
		for(i=1; i<=10; i++) {
			ans = num*i;
			System.out.println(num+"*"+i +" = "+ ans);
		}

	}

}
