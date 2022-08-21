package Day5;

public class Assignment1 {
	//Static/Compile Time/Method Overloading Polyphormism : 
	//Method name will be same
	//Method output will not be same
	//Method output can be same or can't be same
	
	public void Arithmatic(int a , int b) {
		int c;
		c=a+b;
		System.out.println("Print the value of c "+c);
		
	}
	
	public int Arithmatic(int x, int y, int z) {
		int w;
		w=x+y+z;
		System.out.println("Print the value of w "+w);
		return w;
	}
	
	public void Arithmatic(int a,float b) {
		System.out.println("Input is different");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 obj1=new Assignment1();
		obj1.Arithmatic(10, 20);
		obj1.Arithmatic(1, 2);
		obj1.Arithmatic(1, 2, 3);
		

	}

}
