package Day2;

public class Assignment1 {
//(10+2)(12-3)
	
	public int sum(int a, int b) {
		int c;
		c=a+b;
		System.out.println("Sum result is "+c);
		return c;
	}
	
	public int sub(int a1, int b1) {
		int c1;
		c1=a1-b1;
		System.out.println("Sub result is "+c1);
		return c1;
		
	}
	
	
	public void multi(int a2,int b2) {
		int c2;
		c2=a2*b2;
		System.out.println("Final result is "+c2);
	}
	public static void main(String[] args) {
		Assignment1 obj1=new Assignment1();
		int sum=obj1.sum(10, 2);
		int sub=obj1.sub(12, 3);
		obj1.multi(sum, sub);
				
		

	}

}
