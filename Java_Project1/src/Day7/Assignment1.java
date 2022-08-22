package Day7;

import java.util.Scanner;

public class Assignment1 {
	
	//((((a1+a2)+a3)*a4)-a5)/a6)
	
	public int sum(int a1, int a2) {
		int c1;
		c1=a1+a2;
		System.out.println("Result of sum is "+c1);
		return c1;
	}
	
	public int multi(int x2, int y2) {
		int z2;
		z2=x2*y2;
		System.out.println("Result of multi is "+z2);
		return z2;
	}
	
	public int sub(int x3, int y3) {
		int z3;
		z3=x3-y3;
		System.out.println("Result of substraction is "+z3);
		return z3;
		
	}
	
	public void devide(int x4,int y4) {
		int z4;
		z4=x4/y4;
		System.out.println("Final Result is "+z4);
		
		
	}

	public static void main(String[] args) {
		
		//System.out.println("Enter the value");
		Assignment1 obj=new Assignment1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a1");
		int a1=s.nextInt();
		System.out.println("Enter the value of a2");
		int a2=s.nextInt();
		int sum1=obj.sum(a1, a2);
		System.out.println("Enter the value of a3");
		int a3=s.nextInt();
		int sum2=obj.sum(sum1, a3);
		System.out.println("Enter the value of a4");
		int a4=s.nextInt();
		int multi=obj.multi(sum2, a4);
		System.out.println("Enter the value of a5");
		int a5=s.nextInt();
		int sub=obj.sub(multi, a5);
		System.out.println("Enter the value of a6");
		int a6=s.nextInt();
		obj.devide(sub, a6);
		
	
		
		
		
		
		

	}

}
