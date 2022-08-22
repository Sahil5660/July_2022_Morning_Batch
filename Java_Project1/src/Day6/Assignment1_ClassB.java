package Day6;

public class Assignment1_ClassB extends Assignment1_ClassA  {


		public Assignment1_ClassB(int a,int c) {
			super(1,2);
		
			System.out.println("Child two parameterized constructor");
			
		}
		public Assignment1_ClassB() {
			this(1,2);
			
			System.out.println("Child default constructor");
			
		}
		public Assignment1_ClassB(int x) {
			this();
			
			System.out.println("Child one parameterized constructor");
			
		}
		public Assignment1_ClassB(int l, int d, int f) {
			this(1);
			System.out.println("Child three parameterized constructor");
			
		}
		
		public static void main(String[]args) {
			Assignment1_ClassB object=new Assignment1_ClassB(1,2,3);

	}
}


