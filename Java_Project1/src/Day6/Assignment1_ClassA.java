package Day6;

public class Assignment1_ClassA {
	
	//Output should be in below format
	//Parent three parameterized constructor
	//Parent default constructor
	//Parent one parameterized constructor
	//Parent two parameterized constructor
	//Child two parameterized constructor
	//Child default constructor
	//Child one parameterized constructor
	//Child three parameterized constructor
	
	public Assignment1_ClassA(int a, int b, int c) {
		System.out.println("Parent three parameterized constructor");
		
	}
	public Assignment1_ClassA() {
		this(1,2,3);
		System.out.println("Parent default constructor");
		
	}
	public Assignment1_ClassA(int x) {
		this();
		System.out.println("Parent one parameterized constructor");
		
	}
	public Assignment1_ClassA(int l, int d) {
		this(1);
		
		System.out.println("Parent two parameterized constructor");
		
	}
	
	
	

}
