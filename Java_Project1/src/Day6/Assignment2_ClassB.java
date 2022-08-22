package Day6;

public class Assignment2_ClassB extends Assignment2_ClassA  {
	
	public void m1() {
		super.Sahil=100;
		super.m1(1,2,3);
		super.m1();
		super.m1(1);
		super.m1(1,2);
		System.out.println("Child default method");
	}
	public void m1(int a, int b, int c) {
		this.m1();
		System.out.println("Child three parameterized method");
	}
	public void m1(int a, int g) {
		this.m1(1,2,3);
		System.out.println("Child two parameterized method");
	}
	public void m1(int a) {
		this.m1(1,2);
		System.out.println("Child one parameterized method");
	}
	
	public void m2() {
		super.Sahil=100; //Calling reference variable from parent class by using super keyword
		
	}
	
	public static void main(String[]args) {
		Assignment2_ClassB obj= new Assignment2_ClassB();
		obj.m1(1);
		obj.m2();
		System.out.println();
		
		
	}

}
