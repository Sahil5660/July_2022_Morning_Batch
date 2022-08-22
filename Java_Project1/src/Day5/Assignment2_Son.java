package Day5;

public class Assignment2_Son extends Assignment2_Father {
	
	// With the help of Son object we can call Grandfather and Father properties and this is a multilevel inheritance
	
	public void Son() {
		System.out.println("Son Age is");
	}

	public static void main(String[] args) {
		
		Assignment2_Son Obj=new Assignment2_Son();
		Obj.Age=20;
		System.out.println("Age is "+Obj.Age);
		Obj.FatherName();
		Obj.Grandfather();
		
	}

}
