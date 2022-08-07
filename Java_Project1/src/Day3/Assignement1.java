package Day3;

public class Assignement1 {
	//Constructor is like a method
	//Constuctor name and class name will be same
	//No need to call constructor it will be call itself when we are creating object
	//No return type of constrcutor
	
	public Assignement1() {
		System.out.println("Default Constructor");
	}
	public Assignement1(int a) {
		System.out.println("One Parameterized Constructor");
	}
	
	public Assignement1(int a1 , int b1) {
		System.out.println("Two Parameterized Constructor");
	}

	public static void main(String[] args) {
		
		Assignement1 obj1=new Assignement1();
		Assignement1 obj2=new Assignement1(10);
		Assignement1 obj3=new Assignement1(10,12);
	

	}

}
