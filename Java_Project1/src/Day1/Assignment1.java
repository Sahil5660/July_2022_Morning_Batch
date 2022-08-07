package Day1;

public class Assignment1 {
	
	int a; //variables
	
	public void sum() {
		System.out.println("This is sum method");
	}

	public static void main(String[] args) {
		
    Assignment1 obj1=new Assignment1();
    obj1.sum();
    obj1.a=1;
    System.out.println(obj1.a);
    obj1.a=80;
    System.out.println(obj1.a);// we can change a value of variable
    
	}

}
