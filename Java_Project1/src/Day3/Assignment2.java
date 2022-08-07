package Day3;

public class Assignment2 {
	
	//4 Parametrized Constructor
	//Default Constructor
	// 1 Parametrized Constructor
	// 2 Parametrized Constructor
	// 3 Parametrized Constructor
	
	public Assignment2() {
		this(1,2,3,4);
		System.out.println("Default Constructor");
	}
	public Assignment2(int a) {
		this();
		System.out.println("1 Parametrized Constructor");
	}
	public Assignment2(int a1, int b1) {
		this(1);
		System.out.println("2 Parametrized Constructor");
	}
	public Assignment2(int a2, int b2, int c3) {
		this(1,2);
		System.out.println("3 Parametrized Constructor");
	}
	public Assignment2(int x, int y, int z, int w) {
		System.out.println("4 Parametrized Constructor");
	}

	public static void main(String[] args) {
		Assignment2 obj1=new Assignment2(1,2,3);
	}

}
