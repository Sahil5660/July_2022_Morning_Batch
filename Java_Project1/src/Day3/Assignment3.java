package Day3;

public class Assignment3 {
	
	//three parametrized method
	//default parametrized method
	//four parametrized method
	//one parametrized method
	// two parametrized method
	
	public void m1() {
		this.m4(1, 2, 3);
		System.out.println("default parametrized method");
	}
	
	public void m2(int a) {
		this.m5(1, 2, 3, 4);
		System.out.println("One parametrized method");
	}
	
	public void m3(int b,int c) {
		this.m2(1);
		System.out.println("two parametrized method");
	}
	
	public void m4(int d, int e, int f) {
		System.out.println("three parametrized method");
	}
	
	public void m5(int g, int h, int i, int j) {
		this.m1();
		System.out.println("four parametrized method");
	}
	
	
	

	public static void main(String[] args) {
		Assignment3 obj1=new Assignment3();
		obj1.m3(1,2);

	}

}
