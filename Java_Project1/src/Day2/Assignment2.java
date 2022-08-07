package Day2;

public class Assignment2 {
	
	//((((10+2)+2)-2)*2)/2)
	
	public int sum(int a1, int b2) {
		int c1;
		c1=a1+b2;
		System.out.println("Sum result is "+c1);
		return c1;
	}
	
	public int sub(int a2, int b2) {
		int c2;
		c2=a2-b2;
		System.out.println("Sub result is "+c2);
		return c2;
	}
	
	public int multi(int a3, int b3) {
		int c3;
		c3=a3*b3;
		System.out.println("Multi result is "+c3);
		return c3;
	}
	
	public void devide(int a4,int b4) {
		
		int c4;
		c4=a4/b4;
		System.out.println("Final Result is "+c4);
		
	}

	public static void main(String[] args) {
		
		Assignment2 obj1=new Assignment2();
		int sumResult1=obj1.sum(10, 2);
		int sumResult2=obj1.sum(sumResult1, 2);
		int subResult=obj1.sub(sumResult2, 2);
		int multiResult=obj1.multi(subResult, 2);
		obj1.devide(multiResult, 2);
		
		
		
		

	}

}
