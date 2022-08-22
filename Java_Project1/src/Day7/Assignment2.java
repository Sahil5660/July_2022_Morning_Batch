package Day7;

import java.util.Scanner;

public class Assignment2 {
	
	public int multi(int a1, int a2) {
		int a3;
		a3=a1*a2;
		System.out.println("Result of multiplication is "+a3);
		return a3;
		
	}
	
	public int sum(int a4, int a5) {
		int a6;
		a6=a4+a5;
		System.out.println("Result of sum is "+a6);
		return a6;
	}
	
	public int sub(int a7, int a8) {
		int a9;
		a9=a7-a8;
		System.out.println("Result of sub is "+a9);
		return a9;
		
	}
	
	public void devide(int a10, int a11) {
		int a12;
		a12=a10/a11;
		System.out.println("Final result is "+a12);
	}

	public static void main(String[] args) {
		Assignment2 obj1=new Assignment2();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a1");
		int a1=s.nextInt();
		System.out.println("Enter the value of a2");
		int a2=s.nextInt();
		//System.out.println("Result of sum is");
		int multi=obj1.multi(a1, a2);
		System.out.println("Enter the value of a3");
		int a3=s.nextInt();
		int sum1=obj1.sum(multi, a3);
		System.out.println("Enter the value of a4");
		int a4=s.nextInt();
		int sum2=obj1.sum(sum1, a4);
		System.out.println("Enter the value of a5");
		int a5=s.nextInt();
		int sub=obj1.sub(sum2, a5);
		System.out.println("Enter the value of a6");
		int a6=s.nextInt();
		obj1.devide(sub, a6);	

	}

}
